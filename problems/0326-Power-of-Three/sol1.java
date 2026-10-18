// ==========================================================
// 326. Power of Three
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 24 ms (Beats 5%)
// Memory     : 45.3 MB (Beats 99%)
// Link       : https://leetcode.com/problems/power-of-three/
// ==========================================================

class Solution {
    public boolean isPowerOfThree(int n) {
        if (n < 1) {
            return false;
        }

        while (n % 3 == 0) {
            n = n / 3;
        }

        return n == 1;
    }
}