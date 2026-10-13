// ==========================================================
// 507. Perfect Number
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 86%)
// Memory     : 42.1 MB (Beats 44%)
// Link       : https://leetcode.com/problems/perfect-number/
// ==========================================================

class Solution {
    public boolean checkPerfectNumber(int num) {
        if (num <= 1) return false;

        int sum = 1;
        for (int i = 2; i <= num / i; i++) {
            if (num % i == 0) {
                sum += i;
                if (i != num / i) sum += num / i;
            }
        }

        return sum == num;
    }
}