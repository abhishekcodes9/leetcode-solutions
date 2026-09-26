// ==========================================================
// 50. Pow(x, n)
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 47.7 MB (Beats 77%)
// Link       : https://leetcode.com/problems/powx-n/
// ==========================================================

class Solution {
    public double myPow(double x, int n) {
        long p = n;
        if (p < 0) {
            x = 1 / x;
            p = -p;
        }

        double ans = 1;

        while (p > 0) {
            if ((p & 1) == 1)
                ans *= x;

            x *= x;
            p >>= 1;
        }

        return ans;
    }
}