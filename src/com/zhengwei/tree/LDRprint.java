package com.zhengwei.tree;

import com.zhengwei.tree.TreeNode;

/**
 * @Author: zhengwei
 * @Date: 4/7/21
 * @Description: 二叉树中序遍历
 */
public class LDRprint {

    public static void main(String [] args){
        TreeNode root = initTree();
        LDRPrintTree(root);
    }

    private static void LDRPrintTree(TreeNode treeNode){
        if(treeNode!=null){
            LDRPrintTree(treeNode.left);
            //递归至最底层进行打印中序值
            System.out.println(treeNode.value);
            LDRPrintTree(treeNode.right);
        }
    }

    private static TreeNode initTree(){
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
