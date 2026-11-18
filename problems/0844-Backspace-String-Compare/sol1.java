// ==========================================================
// 844. Backspace String Compare
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 3 ms (Beats 23%)
// Memory     : 42.6 MB (Beats 71%)
// Link       : https://leetcode.com/problems/backspace-string-compare/
// ==========================================================

class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();

        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='#'){
                if(!st1.isEmpty()){
                    st1.pop();
                }
            }    
            else{
                st1.push(ch);
            }
        }

        for(int i=0;i<t.length();i++){
            char ch = t.charAt(i);
            if(ch=='#'){
                if(!st2.isEmpty()){
                    st2.pop();
                }
            }    
            else{
                st2.push(ch);
            }
        } 

        return st1.equals(st2); 
    }
}