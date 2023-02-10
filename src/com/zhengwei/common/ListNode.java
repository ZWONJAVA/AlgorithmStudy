package com.zhengwei.common;

/**
 * @Author: zhengwei
 * @Date: 4/14/21
 * @Description:
 */
public class ListNode {

    private int value;

    private ListNode next;

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public ListNode(int value) {
        this.value = value;
    }
}
