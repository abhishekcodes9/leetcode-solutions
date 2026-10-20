// ==========================================================
// 179. Largest Number
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 7 ms (Beats 27%)
// Memory     : 44.3 MB (Beats 99%)
// Link       : https://leetcode.com/problems/largest-number/
// ==========================================================

import java.util.Arrays;

class Solution {
    public String largestNumber(int[] nums) {
        String[] arr = new String[nums.length];

        for (int i = 0; i < nums.length; i++) {
            arr[i] = String.valueOf(nums[i]);
        }

        Arrays.sort(arr, (a, b) -> (b + a).compareTo(a + b));

        if (arr[0].equals("0")) {
            return "0";
        }

        StringBuilder result = new StringBuilder();

        for (String s : arr) {
            result.append(s);
        }

        return result.toString();
    }
}