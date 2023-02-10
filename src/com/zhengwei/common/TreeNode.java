package com.zhengwei.common;

/**
 * @Author: zhengwei
 * @Date: 4/6/21
 * @Description: 二叉树节点
 */
public class TreeNode {

    TreeNode left;

    TreeNode right;

    public TreeNode getLeft() {
        return left;
    }

    public void setLeft(TreeNode left) {
        this.left = left;
    }

    public TreeNode getRight() {
        return right;
    }

    public void setRight(TreeNode right) {
        this.right = right;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    int value;

    TreeNode(int value){
        this.value = value;
    }

}
