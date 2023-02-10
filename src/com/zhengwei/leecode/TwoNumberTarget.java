package com.zhengwei.leecode;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: zhengwei
 * @Date: 4/13/21
 * @Description: 两数之和
 */
public class TwoNumberTarget {

    private static int[] array = {2, 7, 11, 15};

    public static void main(String[] args) {

        solution(array, 9);

    }


    public static void solution(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(target - nums[i])) {
                System.out.println(i + " " + map.get(target - nums[i]).longValue());
            } else {
                map.put(nums[i], i);
            }

        }
    }

}
