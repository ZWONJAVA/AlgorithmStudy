package com.zhengwei.sort;

/**
 * @Author: zhengwei
 * @Date: 3/22/21
 * @Description: 快速排序
 */
public class QuickSort2 {

    private static int[] array = {3, 6, 2, 5, 88, 2, 3, 7, 89, 0};


    public static void main(String[] args) {
        quickSort(array, 0, array.length - 1);
        for (int i : array) {
            System.out.println(i);
        }
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
