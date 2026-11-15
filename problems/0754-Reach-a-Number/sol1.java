// ==========================================================
// 754. Reach a Number
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 78%)
// Memory     : 41.6 MB (Beats 78%)
// Link       : https://leetcode.com/problems/reach-a-number/
// ==========================================================


class Solution {
    public int reachNumber(int target) {
        target = Math.abs(target);

        int sum = 0;
        int moves = 0;

        while (sum < target || (sum - target) % 2 != 0) {
            moves++;
            sum += moves;
        }

        return moves;
    }
}
