// ==========================================================
// 1021. Remove Outermost Parentheses
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 4 ms (Beats 53%)
// Memory     : 42.6 MB (Beats 100%)
// Link       : https://leetcode.com/problems/remove-outermost-parentheses/
// ==========================================================

class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int count=0;
        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                if(count>0){
                    sb.append(ch);
                }
                count++;
            }
            else{
                count--;
                if(count>0){
                    sb.append(ch);
                }
            }
        }
        return sb.toString();
    }
}