// ==========================================================
// 20. Valid Parentheses
// Difficulty : Easy
// Language   : Java
// Solution   : #2
// Runtime    : 3 ms (Beats 85%)
// Memory     : 42.7 MB (Beats 88%)
// Link       : https://leetcode.com/problems/valid-parentheses/
// ==========================================================

import java.util.*;

class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();

        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                st.push(c);
            } else {
                if (st.isEmpty()) return false;

                char top = st.pop();

                if ((c == ')' && top != '(') ||
                    (c == '}' && top != '{') ||
                    (c == ']' && top != '[')) {
                    return false;
                }
            }
        }

        return st.isEmpty();
    }
}