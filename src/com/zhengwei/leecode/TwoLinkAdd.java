package com.zhengwei.leecode;

import com.zhengwei.common.ListNode;

/**
 * @Author: zhengwei
 * @Date: 2023/2/7
 * @Description: https://leetcode.wang/leetCode-2-Add-Two-Numbers.html
 * 就是两个链表表示的数相加，这样就可以实现两个很大的数相加了
 */
public class TwoLinkAdd {

    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0;
        int sum = 0;
        ListNode result = new ListNode(0);
        ListNode head = result;
        while (l1 != null || l2 != null) {
            int add = (l1 == null ? 0 : l1.val) + (l2 == null ? 0 : l2.val) + result.val;
            carry = add / 10;
            sum = add % 10;
            result.val = sum;
            l1 = l1.next;
            l2 = l2.next;
            if (carry > 0) {
                result.next = new ListNode(carry);
            } else {
                result.next = new ListNode(0);
            }
            result = result.next;
        }
        return head;
    }

    public static void main(String[] args) {
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(4);
        ListNode node3 = new ListNode(3);
        node1.next = node2;
        node2.next = node3;

        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);
        ListNode node6 = new ListNode(4);
        node4.next = node5;
        node5.next = node6;

        addTwoNumbers(node1 , node4);
    }


    private static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

}
