package com.zhengwei.leecode;

import java.util.Arrays;

/**
 * @Author: zhengwei
 * @Date: 4/13/21
 * @Description:
 */
public class MaxSubArray {

    private static int[] array = {-2,1,-3,4,-1,2,1,-5,4};

    public static void main(String[] args) {
        System.out.println(maxSubArray(array));
    }



    public static int maxSubArray(int[] nums) {
        if(nums.length == 1) return nums[0];
        int max = 0;
        int lastNum = nums[0];
        for(int right = 1 ; right<= nums.length - 1;right++){
            lastNum = lastNum + nums[right];
            max = Math.max(lastNum ,max);
        }
        for(int left = 0 ; left<= nums.length - 1;left++){
            lastNum = lastNum - nums[left];
            max = Math.max(lastNum ,max);
        }
        return max;
    }

}
