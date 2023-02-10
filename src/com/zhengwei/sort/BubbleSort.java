package com.zhengwei.sort;

import java.util.Arrays;

/**
 * @Author: zhengwei
 * @Date: 3/22/21
 * @Description: 冒泡排序
 */
public class BubbleSort {

    private static int [] array = {3,6,2,5,88,2,3,7,89,0};


    public static void main(String [] args){
        bubble(array);
        for(int i : array){
            System.out.println(i);
        }
    }

    private static void bubble(int [] array){
        int temp;
        for(int i=0;i<array.length-1;i++){
            for(int j=0;j<array.length-1-i;j++){
                if(array[j]>array[j+1]){
                    temp = array[j+1];
                    array[j+1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    public void findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
    }

}
