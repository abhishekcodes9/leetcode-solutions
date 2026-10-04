// ==========================================================
// 189. Rotate Array
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 5 ms (Beats 39%)
// Memory     : 268.5 MB (Beats 69%)
// Link       : https://leetcode.com/problems/rotate-array/
// ==========================================================

class Solution {
    public void rotate(int[] nums, int k) {
        k %= nums.length;

        reverse(nums, 0, nums.length - 1);
        reverse(nums, 0, k - 1);
        reverse(nums, k, nums.length - 1);
    }

    void reverse(int[] a, int l, int r) {
        while (l < r) {
            int t = a[l];
            a[l++] = a[r];
            a[r--] = t;
        }
    }
}