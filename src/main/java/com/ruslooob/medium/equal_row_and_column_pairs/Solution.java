package com.ruslooob.medium.equal_row_and_column_pairs;

class Solution {
    public static void main(String[] args) {
        System.out.println(new Solution().equalPairs(new int[][]{
                new int[]{3, 2, 1},
                new int[]{1, 7, 6},
                new int[]{2, 7, 7},
        }));
    }

    public int equalPairs(int[][] grid) {
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid.length; j++) {
                if (grid[i][j] != grid[j][i]) break;
            }
            count++;
        }
        return count;
    }
}