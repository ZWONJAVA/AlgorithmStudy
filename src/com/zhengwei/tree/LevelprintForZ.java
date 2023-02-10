package com.zhengwei.tree;

import com.zhengwei.tree.TreeNode;

import java.util.*;

/**
 * @Author: zhengwei
 * @Date: 4/7/21
 * @Description: 二叉树层序遍历  Z字形
 */
public class LevelprintForZ {

    static Queue<Integer> queue = new PriorityQueue();


    public static void main(String[] args) {
        TreeNode root = initTree();
        kthLargest(root , 2);
    }

    public static int kthLargest(TreeNode root, int k) {
        for(int i =0 ; i<k-1;i++){
            queue.poll();
        }
        if(queue.isEmpty()) return 0;
        return queue.peek();
    }

    private static void DFS(TreeNode root){
        if(root == null) return;
        queue.offer(root.value);
        DFS(root.left);
        DFS(root.right);
    }

    private static void LevelPrintTree(TreeNode treeNode) {
        //保存二叉树的队列
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();

        //保存偶数行的堆栈
        Stack<TreeNode> treeNodeStack = new Stack<>();

        //根节点入队列
        if (treeNode != null) {
            treeNodeQueue.offer(treeNode);
        }

        //行号
        int line = 1;

        //队列不为空
        while (!treeNodeQueue.isEmpty() || !treeNodeStack.isEmpty()) {

            //该层的元素个数
            int num;
            if (line % 2 == 0) {
                num = treeNodeStack.size();
            } else {
                num = treeNodeQueue.size();
            }

            //打印num个该层的元素
            for (int i = 0; i < num; i++) {

                TreeNode node;
                if (line % 2 == 0) {
                    //偶数行  堆栈出栈
                    node = treeNodeStack.pop();
                } else {
                    //奇数行  队列出栈
                    node = treeNodeQueue.poll();
                }

                if (node != null) {

                    //偶数行，出堆栈
                    System.out.println(node.value);

                    if (line % 2 == 0) {
                        //偶数行  下一层进队列
                        treeNodeQueue.offer(node.right);
                        treeNodeQueue.offer(node.left);
                    } else {
                        //奇数行  下一层进堆栈
                        treeNodeStack.push(node.left);
                        treeNodeStack.push(node.right);
                    }
                }
            }

            line++;
        }
    }

    private static List<List<Integer>> LevelPrintTree2(TreeNode treeNode) {
        Deque<TreeNode> list = new LinkedList<>();
        List<List<Integer>> result = new ArrayList<>();

        int size = 0;
        boolean isLeft = true;

        if (treeNode == null) {
            return result;
        }

        list.offer(treeNode);

        while (!list.isEmpty()) {
            Deque<TreeNode> level = new LinkedList<>();
            List<Integer> values = new ArrayList<>();

            size = list.size();

            for (int i = 0; i < size; i++) {
                TreeNode node = list.poll();
                values.add(node.value);

                if(isLeft){
                    if(node.right!=null) level.addLast(node.right);
                    if(node.left!=null) level.addLast(node.left);
                }else{
                    if(node.right!=null) level.addFirst(node.right);
                    if(node.left!=null) level.addFirst(node.left);
                }


            }

            list.addAll(level);
            result.add(values);
            values.clear();
            level.clear();
            isLeft = !isLeft;
        }

        return result;
    }


    private static TreeNode initTree() {
        TreeNode root = new TreeNode(1);

        root.left = new TreeNode(2);
        root.right = new TreeNode(3);

        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

        root.right.left = new TreeNode(6);
        root.right.right = new TreeNode(7);

        return root;

    }

}
