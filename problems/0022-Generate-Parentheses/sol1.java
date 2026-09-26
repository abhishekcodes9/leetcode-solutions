// ==========================================================
// 22. Generate Parentheses
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 69%)
// Memory     : 45 MB (Beats 21%)
// Link       : https://leetcode.com/problems/generate-parentheses/
// ==========================================================

class Solution {
    List<String> ans = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        backtrack("", 0, 0, n);
        return ans;
    }

    void backtrack(String s, int open, int close, int n) {
        if (s.length() == 2 * n) {
            ans.add(s);
            return;
        }

        if (open < n)
            backtrack(s + "(", open + 1, close, n);

        if (close < open)
            backtrack(s + ")", open, close + 1, n);
    }
}