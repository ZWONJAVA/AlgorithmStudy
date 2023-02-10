package com.zhengwei.leecode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhengwei
 * @Date: 4/13/21
 * @Description: 两个有序数列合并成有序数列
 */
public class TwoArrayMerge {

    private static int[] array1 = {2, 7, 11, 15};
    private static int[] array2 = {1, 3, 11, 12};

    public static void main(String[] args) {



    }


    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if(nums1.length == 0 || nums2.length == 0) return;

        int res [] = new int[m+n];
        int p1 = 0 , p2 = 0 ,curr = 0,index = 0;

        while(p1 < m || p2 < n) {
            if(p1 == m) {
                curr = nums2[p2++];
            }else if(p2 == n) {
                curr = nums1[p1++];
            }else if(nums1[p1] <= nums2[p2]){
                curr = nums1[p1++];
            }else{
                curr = nums2[p2++];
            }

            res[index] = curr;
            index++;
        }

        for(int i = 0 ; i< res.length ;i++){
            nums1[i] = res[i];
        }

    }

}
