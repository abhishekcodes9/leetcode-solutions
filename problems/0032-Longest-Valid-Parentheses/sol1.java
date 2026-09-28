// ==========================================================
// 32. Longest Valid Parentheses
// Difficulty : Hard
// Language   : Java
// Solution   : #1
// Runtime    : 5 ms (Beats 76%)
// Memory     : 46.6 MB (Beats 41%)
// Link       : https://leetcode.com/problems/longest-valid-parentheses/
// ==========================================================

class Solution {
    public int longestValidParentheses(String s) {
        Stack<Integer> st = new Stack<>();
        st.push(-1);

        int ans = 0;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                st.push(i);
            } else {
                st.pop();

                if (st.isEmpty())
                    st.push(i);
                else
                    ans = Math.max(ans, i - st.peek());
            }
        }

        return ans;
    }
}