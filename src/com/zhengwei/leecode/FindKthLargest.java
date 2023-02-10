package com.zhengwei.leecode;

import java.util.Arrays;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * @Author: zhengwei
 * @Date: 4/13/21
 * @Description: 寻找数组的第K大元素
 */
public class FindKthLargest {

    private static int[] array = {3, 6, 2, 5, 88, 2, 3, 7, 89, 0};

    public static void main(String[] args) {
        findKthLargest(array, 2);
    }

    private static void findKthLargest(int[] nums, int k) {
        quickSort(nums , 0 , nums.length - 1);
        System.out.println(nums[nums.length - k]);
    }

    private static void quickSort(int[] nums, int left, int right) {
        if (left > right) return;

        int base = nums[left];
        int temp;
        int i = left;
        int j = right;

        while (i < j) {
            while (i < j && base <= nums[j]) j--;
            while (i < j && base >= nums[i]) i++;
            if (i < j) {
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
            }
        }

        nums[left] = nums[i];
        nums[i] = base;

        quickSort(nums, left, j - 1);
        quickSort(nums, j + 1, right);
    }



}
