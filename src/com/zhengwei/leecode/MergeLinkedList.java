package com.zhengwei.leecode;

import com.zhengwei.common.ListNode;

import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Author: zhengwei
 * @Date: 4/13/21
 * @Description: 合并两个升序链表
 */
public class MergeLinkedList {


    public static void main(String[] args) {
        ListNode node1 = init1();
        ListNode node2 = init2();

        ListNode result = merge(node1 , node2);

        while (result!=null) {
            System.out.println(result.getValue());
            result = result.getNext();
        }

    }

    private static ListNode merge(ListNode node1 , ListNode node2){

        if(node1 == null) return node2;
        if(node2 == null) return node1;

        if(node1.getValue() <= node2.getValue()) {
            node1.setNext(merge(node1.getNext() , node2));
            return node1;
        }else {
            node2.setNext(merge(node1 , node2.getNext()));
            return node2;
        }

    }



    private static ListNode init1(){
        ListNode root = new ListNode(1);
        ListNode node1 = new ListNode(3);
        ListNode node2 = new ListNode(5);

        root.setNext(node1);
        node1.setNext(node2);

        return root;
    }

    private static ListNode init2(){
        ListNode root = new ListNode(2);
        ListNode node1 = new ListNode(4);
        ListNode node2 = new ListNode(6);

        root.setNext(node1);
        node1.setNext(node2);

        return root;
    }



}
