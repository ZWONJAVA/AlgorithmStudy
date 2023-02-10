package com.zhengwei.DTGH;

import java.util.Scanner;

/**
 * @Author: zhengwei
 * @Date: 5/30/21
 * @Description:
 */
public class 矩阵最大路径和 {

    public static int maxCost(int[][] cost) {

        int m = cost.length, n = cost[0].length;
        int[][] dp = new int[m][n];

        dp[0][0] = cost[0][0];

        for (int i = 1; i < m; i++) {
            dp[i][0] = dp[i - 1][0] + cost[i][0];
        }

        for (int j = 1; j < n; j++) {
            dp[0][j] = dp[0][j - 1] + cost[0][j];
        }


        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[i][j] = Math.max(dp[i - 1][j], dp[i][j - 1]) + cost[i][j];
            }
        }

        return dp[m - 1][n - 1];
    }


}
