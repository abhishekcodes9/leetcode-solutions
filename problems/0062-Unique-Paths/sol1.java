// ==========================================================
// 62. Unique Paths
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 41.6 MB (Beats 96%)
// Link       : https://leetcode.com/problems/unique-paths/
// ==========================================================


class Solution {
    public int uniquePaths(int m, int n) {
        int[] dp = new int[n];

        java.util.Arrays.fill(dp, 1);

        for (int i = 1; i < m; i++) {
            for (int j = 1; j < n; j++) {
                dp[j] = dp[j] + dp[j - 1];
            }
        }

        return dp[n - 1];
    }
}
