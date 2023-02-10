package com.zhengwei.tree;

import com.zhengwei.tree.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * @Author: zhengwei
 * @Date: 4/7/21
 * @Description: 二叉树层序遍历
 */
public class Levelprint {

    public static void main(String[] args) {
        TreeNode root = initTree();
        LevelPrintTree(root);
    }

    private static void LevelPrintTree(TreeNode treeNode) {
        //保存二叉树的队列
        Queue<TreeNode> treeNodeQueue = new LinkedList<>();

        //根节点入队列
        if (treeNode != null) {
            treeNodeQueue.offer(treeNode);
        }

        //队列不为空
        while (!treeNodeQueue.isEmpty()) {
            //该层的元素个数
            int num = treeNodeQueue.size();

            //打印num个该层的元素
            for (int i = 0; i < num; i++) {
                TreeNode node = treeNodeQueue.poll();
                if (node != null) {
                    System.out.println(node.value);

                    treeNodeQueue.offer(node.left);
                    treeNodeQueue.offer(node.right);
                }
            }
        }
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
