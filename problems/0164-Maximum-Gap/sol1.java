// ==========================================================
// 164. Maximum Gap
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 11 ms (Beats 91%)
// Memory     : 90.8 MB (Beats 60%)
// Link       : https://leetcode.com/problems/maximum-gap/
// ==========================================================

class Solution {
    public int maximumGap(int[] nums) {
        if (nums.length < 2) return 0;

        int min = nums[0], max = nums[0];
        for (int x : nums) {
            min = Math.min(min, x);
            max = Math.max(max, x);
        }

        if (min == max) return 0;

        int n = nums.length;
        int gap = Math.max(1, (max - min) / (n - 1));

        int[] mn = new int[n], mx = new int[n];
        Arrays.fill(mn, Integer.MAX_VALUE);
        Arrays.fill(mx, Integer.MIN_VALUE);

        for (int x : nums) {
            int i = (x - min) / gap;
            i = Math.min(i, n - 1);
            mn[i] = Math.min(mn[i], x);
            mx[i] = Math.max(mx[i], x);
        }

        int ans = 0, prev = min;

        for (int i = 0; i < n; i++) {
            if (mn[i] == Integer.MAX_VALUE) continue;

            ans = Math.max(ans, mn[i] - prev);
            prev = mx[i];
        }

        return ans;
    }
}