// ==========================================================
// 71. Simplify Path
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 4 ms (Beats 94%)
// Memory     : 44.9 MB (Beats 49%)
// Link       : https://leetcode.com/problems/simplify-path/
// ==========================================================

class Solution {
    public String simplifyPath(String path) {
        Deque<String> stack = new ArrayDeque<>();

        for (String s : path.split("/")) {
            if (s.equals("") || s.equals("."))
                continue;

            if (s.equals("..")) {
                if (!stack.isEmpty())
                    stack.pop();
            } else {
                stack.push(s);
            }
        }

        StringBuilder ans = new StringBuilder();

        while (!stack.isEmpty())
            ans.append("/").append(stack.removeLast());

        return ans.length() == 0 ? "/" : ans.toString();
    }
}