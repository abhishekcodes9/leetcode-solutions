// ==========================================================
// 120. Triangle
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 3 ms (Beats 80%)
// Memory     : 45.2 MB (Beats 73%)
// Link       : https://leetcode.com/problems/triangle/
// ==========================================================


import java.util.*;

class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {

        int n = triangle.size();

        int[] dp = new int[n];

        for (int j = 0; j < n; j++) {
            dp[j] = triangle.get(n - 1).get(j);
        }

        for (int i = n - 2; i >= 0; i--) {

            for (int j = 0; j <= i; j++) {

                dp[j] = triangle.get(i).get(j)
                      + Math.min(dp[j], dp[j + 1]);
            }
        }

        return dp[0];
    }
}
