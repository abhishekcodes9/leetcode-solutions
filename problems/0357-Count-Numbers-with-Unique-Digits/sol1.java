// ==========================================================
// 357. Count Numbers with Unique Digits
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 42 MB (Beats 70%)
// Link       : https://leetcode.com/problems/count-numbers-with-unique-digits/
// ==========================================================

class Solution {
    public int countNumbersWithUniqueDigits(int n) {
        if (n == 0) return 1;

        int ans = 10, unique = 9, available = 9;

        for (int i = 2; i <= Math.min(n, 10); i++) {
            unique *= available--;
            ans += unique;
        }

        return ans;
    }
}