package com.zhengwei.find;

import java.util.Arrays;

/**
 * @Author: zhengwei
 * @Date: 8/11/21
 * @Description:
 */
public class 二分查找 {


    private static int[] array = {3, 6, 2, 5, 88, 2, 3, 7, 89, 0};

    public static void main(String[] args) {

        Arrays.sort(array);
        System.out.println(isExist(array , 89 , 0 , array.length -1));

    }
















    private static boolean isExist(int[] array, int target, int i, int j) {

        while (i < j) {

            int mid = (i+j) / 2;

            if (target == array[mid]) return true;

            if (target > array[mid]) {
                i = mid + 1;
            } else {
                j = mid - 1;
            }
        }

        return false;
    }

}
