// ==========================================================
// 64. Minimum Path Sum
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 5 ms (Beats 23%)
// Memory     : 49.9 MB (Beats 81%)
// Link       : https://leetcode.com/problems/minimum-path-sum/
// ==========================================================


class Solution {
    public int minPathSum(int[][] grid) {
        int m = grid.length;
        int n = grid[0].length;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                if (i == 0 && j == 0) {
                    continue;
                }

                int up = Integer.MAX_VALUE;
                int left = Integer.MAX_VALUE;

                if (i > 0) {
                    up = grid[i - 1][j];
                }

                if (j > 0) {
                    left = grid[i][j - 1];
                }

                grid[i][j] += Math.min(up, left);
            }
        }

        return grid[m - 1][n - 1];
    }
}
