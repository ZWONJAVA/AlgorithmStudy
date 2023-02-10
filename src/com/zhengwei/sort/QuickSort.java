package com.zhengwei.sort;

/**
 * @Author: zhengwei
 * @Date: 3/22/21
 * @Description: 快速排序
 */
public class QuickSort {

    private static int[] array = {3, 6, 2, 5, 88, 2, 3, 7, 89, 0};


    public static void main(String[] args) {
        quickSort(array, 0, array.length - 1);
        for (int i : array) {
            System.out.println(i);
        }
    }


    private static void quickSort2(int[] array, int low, int high) {
        if (low > high) {
            return;
        }

        int target = array[low];
        int i = low;
        int j = high;
        int temp;

        while (i < j) {

            while (i < j && array[j] >= target) {
                j--;
            }

            while (i < j && array[i] <= target) {
                i++;
            }

            if (i < j) {
                temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }

        }

        array[low] = array[i];
        array[i] = target;

        quickSort2(array, low, j - 1);
        quickSort2(array, j + 1, high);

    }


//    private static void quickSort(int[] arr, int low, int high) {
//        int i, j, temp, z, y;
//        if (low > high) {
//            return;
//        }
//
//        i = low;
//        j = high;
//
//        //temp就是基准位
//        temp = arr[low];
//
//        while (i < j) {
//            //先看右边，依次往左递减
//            while (temp <= arr[j] && i < j) {
//                j--;
//            }
//
//            //再看左边，依次往右递增
//            while (temp >= arr[i] && i < j) {
//                i++;
//            }
//
//            //如果满足条件则交换
//            if (i < j) {
//                z = arr[i];
//                y = arr[j];
//
//                arr[i] = y;
//                arr[j] = z;
//            }
//        }
//
//        //最后将基准为与i和j相等位置的数字交换
//        arr[low] = arr[i];
//        arr[i] = temp;
//
//        //递归调用左半数组
//        quickSort(arr, low, j - 1);
//
//        //递归调用右半数组
//        quickSort(arr, j + 1, high);
//    }


    private static void quickSort(int[] array, int low, int high) {
        if (low > high) return;

        int target = array[low];
        int i = low, j = high;
        int temp;

        while (i < j) {
            while (i < j && array[j] >= target) j--;
            while (i < j && array[i] <= target) i++;

            if (i < j) {
                temp = array[j];
                array[j] = array[i];
                array[i] = temp;
            }
        }

        array[low] = array[i];
        array[i] = target;

        quickSort(array, low, j - 1);
        quickSort(array, j + 1, high);
    }

}
