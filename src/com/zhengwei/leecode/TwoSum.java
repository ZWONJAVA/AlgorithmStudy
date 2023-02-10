package com.zhengwei.leecode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhengwei
 * @Date: 2023/2/7
 * @Description: https://leetcode.wang/leetCode-1-Two-Sum.html
 * 给定一个数组和一个目标和，从数组中找两个数字相加等于目标和，输出这两个数字的下标。
 */
public class TwoSum {

    public static void main(String[] args) {
        int []nums = new int[4];
        nums[0] = 2;
        nums[1] = 7;
        nums[2] = 11;
        nums[3] = 15;
        int target = 9;
        System.out.println(twoSum(nums , target));
    }

    public  static int[] twoSum(int[] nums, int target) {
        Map<Integer , Integer> valueIndexMap = new HashMap<>();
        int []result = new int[2];
        for(int i = 0 ; i < nums.length ; i++) {
            if(valueIndexMap.containsKey(target - nums[i])) {
                result[0] = valueIndexMap.get(target - nums[i]);
                result[1] = i;
                return result;
            }
            valueIndexMap.put(nums[i] , i);
        }
        return result;
    }

}
