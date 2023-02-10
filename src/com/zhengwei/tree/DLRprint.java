package com.zhengwei.tree;

import com.zhengwei.tree.TreeNode;

/**
 * @Author: zhengwei
 * @Date: 4/7/21
 * @Description: 二叉树前序遍历
 */
public class DLRprint {

    public static void main(String [] args){
        TreeNode root = initTree();
        DLRPrintTree(root);
    }

    private static void DLRPrintTree(TreeNode treeNode){
        if(treeNode!=null){
            //先打印根节点的值
            System.out.println(treeNode.value);
            DLRPrintTree(treeNode.left);
            DLRPrintTree(treeNode.right);
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
