// ==========================================================
// 89. Gray Code
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 5 ms (Beats 55%)
// Memory     : 53.7 MB (Beats 39%)
// Link       : https://leetcode.com/problems/gray-code/
// ==========================================================

class Solution {
    public List<Integer> grayCode(int n) {
        List<Integer> ans = new ArrayList<>();

        for (int i = 0; i < (1 << n); i++)
            ans.add(i ^ (i >> 1));

        return ans;
    }
}