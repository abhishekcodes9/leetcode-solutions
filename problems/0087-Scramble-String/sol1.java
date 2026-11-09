// ==========================================================
// 87. Scramble String
// Difficulty : Hard
// Language   : Java
// Solution   : #1
// Runtime    : 20 ms (Beats 18%)
// Memory     : 46.6 MB (Beats 50%)
// Link       : https://leetcode.com/problems/scramble-string/
// ==========================================================


class Solution {
    Boolean[][][] dp;

    public boolean isScramble(String s1, String s2) {
        int n = s1.length();

        if (n != s2.length()) {
            return false;
        }

        dp = new Boolean[n][n][n + 1];

        return solve(s1, s2, 0, 0, n);
    }

    boolean solve(String s1, String s2, int i, int j, int len) {

        if (s1.substring(i, i + len)
             .equals(s2.substring(j, j + len))) {
            return true;
        }

        if (len == 1) {
            return false;
        }

        if (dp[i][j][len] != null) {
            return dp[i][j][len];
        }

        for (int k = 1; k < len; k++) {

            // Without swapping
            boolean withoutSwap =
                solve(s1, s2, i, j, k) &&
                solve(s1, s2, i + k, j + k, len - k);

            // With swapping
            boolean withSwap =
                solve(s1, s2, i, j + len - k, k) &&
                solve(s1, s2, i + k, j, len - k);

            if (withoutSwap || withSwap) {
                return dp[i][j][len] = true;
            }
        }

        return dp[i][j][len] = false;
    }
}
