package com.zhengwei.sort;

/**
 * @Author: zhengwei
 * @Date: 3/22/21
 * @Description: 插入排序
 */
public class InsertSort {

    private static int [] array = {3,6,2,5,88,2,3,7,89,0};


    public static void main(String [] args){
        insertSort(array);
        for(int i : array){
            System.out.println(i);
        }
    }

    private static void insertSort(int [] array){
        for(int index = 1 ; index < array.length ; index ++){
            int temp = array[index];
            int leftIndex = index - 1 ;
            while(leftIndex>=0 && array[leftIndex] > temp){
                array[leftIndex+1] = array[leftIndex];
                leftIndex--;
            }
            array[leftIndex+1] = temp;
        }
    }

}
