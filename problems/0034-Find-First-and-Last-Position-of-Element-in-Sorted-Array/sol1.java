// ==========================================================
// 34. Find First and Last Position of Element in Sorted Array
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 48.2 MB (Beats 51%)
// Link       : https://leetcode.com/problems/find-first-and-last-position-of-element-in-sorted-array/
// ==========================================================

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int l = 0, r = nums.length - 1, first = -1, last = -1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (nums[m] == target) {
                first = m;
                r = m - 1;
            } else if (nums[m] < target) l = m + 1;
            else r = m - 1;
        }

        l = 0; r = nums.length - 1;

        while (l <= r) {
            int m = (l + r) / 2;
            if (nums[m] == target) {
                last = m;
                l = m + 1;
            } else if (nums[m] < target) l = m + 1;
            else r = m - 1;
        }

        return new int[]{first, last};
    }
}