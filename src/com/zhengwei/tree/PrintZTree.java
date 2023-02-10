package com.zhengwei.tree;

import com.zhengwei.common.TreeNode;

import java.util.Stack;

/**
 * @Author: zhengwei
 * @Date: 4/6/21
 * @Description: Z字型打印二叉树
 */
public class PrintZTree {

    private void printTree(TreeNode treeNode){

        //奇数层堆栈
        Stack<TreeNode> oddStack = new Stack<>();

        //偶数层堆栈
        Stack<TreeNode> evenStack = new Stack<>();

        //层数
        int line = 1;

        //先把根节点推入堆栈
        oddStack.push(treeNode);

        while(true){

        }

    }
}
