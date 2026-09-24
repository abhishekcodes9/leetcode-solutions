// ==========================================================
// 20. Valid Parentheses
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 2 ms (Beats 98%)
// Memory     : 43.2 MB (Beats 57%)
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