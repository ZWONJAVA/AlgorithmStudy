package com.zhengwei.leecode;

import com.zhengwei.common.ListNode;

import java.util.ArrayList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Author: zhengwei
 * @Date: 4/14/21
 * @Description: 反转链表
 */
public class ReverseLinkList {



    public static void main(String[] args) {

        ListNode root = init();

        root = reverse(root);

        while (root!=null){
            System.out.println(root.getValue());
            root = root.getNext();
        }
    }

    private static ListNode reverse(ListNode root){
        if(root == null) return null;

        ListNode pre = null;
        ListNode curr = root;

        while(curr!=null){
            ListNode next = curr.getNext();
            curr.setNext(pre);
            pre = curr;
            curr = next;
        }

        return pre;
    }

























    private static void solution(ListNode root){
        ListNode preNode;
        ListNode nowNode = root;
        ListNode nextNode = root.getNext();

        while(nowNode.getNext()!=null){
            preNode = nowNode;
            nowNode = nextNode;
            if(nowNode.getNext()!=null) {
                nextNode = nowNode.getNext();
            }else{
                break;
            }

            nowNode.setNext(preNode);
        }
    }

    private static ListNode init(){
        ListNode root = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);

        Queue<Integer> queue = new PriorityQueue<>();

        root.setNext(node1);
        node1.setNext(node2);

        return root;
    }


}
