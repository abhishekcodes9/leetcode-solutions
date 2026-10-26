// ==========================================================
// 494. Target Sum
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 646 ms (Beats 6%)
// Memory     : 42.7 MB (Beats 91%)
// Link       : https://leetcode.com/problems/target-sum/
// ==========================================================


class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return solve(nums, 0, 0, target);
    }

    int solve(int[] nums, int i, int sum, int target) {
        if (i == nums.length) {
            if (sum == target) {
                return 1;
            }
            return 0;
        }

        int plus = solve(nums, i + 1, sum + nums[i], target);
        int minus = solve(nums, i + 1, sum - nums[i], target);

        return plus + minus;
    }
}
