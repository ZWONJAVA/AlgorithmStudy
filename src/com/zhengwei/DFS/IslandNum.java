package com.zhengwei.DFS;

import java.util.Arrays;

/**
 * @Author: zhengwei
 * @Date: 4/13/21
 * @Description: 岛屿数量DFS
 */
public class IslandNum {

    public static void main(String[] args) {
        char[][] grid = {{1, 1, 1, 1, 0}, {1, 1, 0, 1, 0}, {1, 1, 0, 0, 0}, {0, 0, 0, 0, 0}};
        System.out.println(numOfIsland(grid));
    }

    private static int numOfIsland(char[][] grid) {
        if (grid == null || grid.length == 0 || grid[0].length == 0) return 0;

        int num = 0;
        int maxSize = 0;
        int row = grid.length;
        int column = grid[0].length;

        for (int r = 0; r < row; r++) {
            for (int c = 0; c < column; c++) {
                if (grid[r][c] == 1) {
                    maxSize = Math.max(maxSize, DFS(r, c, row, column, grid));
                }
            }
        }

        return num;
    }

    private static int DFS(int r, int c, int row, int column, char[][] grid) {
        if (r == -1 || c == -1 || r == row || c == column || grid[r][c] != 0) return 0;

        grid[r][c] = 0;

        int num = 1;

        num += DFS(r + 1, c, row, column, grid);
        num += DFS(r - 1, c, row, column, grid);
        num += DFS(r, c + 1, row, column, grid);
        num += DFS(r, c - 1, row, column, grid);

        return num;
    }

}
