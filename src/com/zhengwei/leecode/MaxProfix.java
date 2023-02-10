package com.zhengwei.leecode;

/**
 * @Author: zhengwei
 * @Date: 4/13/21
 */
public class MaxProfix {

    private static int[] array = {7, 1, 5, 3, 6, 4};

    public static void main(String[] args) {

        System.out.println(maxProfit(array));

    }


    public static int maxProfit(int[] prices) {

        int max = 0;
        int minPrice = Integer.MAX_VALUE;

        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minPrice) {
                minPrice = prices[i];
            }

            if (prices[i] - minPrice >= 0) {
                max = Math.max(prices[i] - minPrice, max);
            }
        }

        return max;
    }


}
