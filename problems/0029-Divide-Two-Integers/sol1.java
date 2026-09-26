// ==========================================================
// 29. Divide Two Integers
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 100%)
// Memory     : 42.7 MB (Beats 32%)
// Link       : https://leetcode.com/problems/divide-two-integers/
// ==========================================================

class Solution {
    public int divide(int dividend, int divisor) {
        if (dividend == Integer.MIN_VALUE && divisor == -1)
            return Integer.MAX_VALUE;

        long a = Math.abs((long) dividend);
        long b = Math.abs((long) divisor);
        long ans = 0;

        while (a >= b) {
            long x = b, count = 1;

            while (a >= (x << 1)) {
                x <<= 1;
                count <<= 1;
            }

            a -= x;
            ans += count;
        }

        if ((dividend < 0) ^ (divisor < 0))
            ans = -ans;

        return (int) ans;
    }
}