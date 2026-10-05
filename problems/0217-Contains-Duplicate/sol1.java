// ==========================================================
// 217. Contains Duplicate
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 13 ms (Beats 99%)
// Memory     : 108.9 MB (Beats 15%)
// Link       : https://leetcode.com/problems/contains-duplicate/
// ==========================================================

class Solution {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> set = new HashSet<>();

        for (int x : nums)
            if (!set.add(x))
                return true;

        return false;
    }
}