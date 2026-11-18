// ==========================================================
// 1047. Remove All Adjacent Duplicates In String
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 26 ms (Beats 52%)
// Memory     : 46.7 MB (Beats 69%)
// Link       : https://leetcode.com/problems/remove-all-adjacent-duplicates-in-string/
// ==========================================================

class Solution {
    public String removeDuplicates(String s) {
       Stack <Character> st = new Stack<>();

       for(int i=0;i<s.length();i++){
        char ch = s.charAt(i);
        if(!st.isEmpty() && st.peek()==ch){
            st.pop();
        }
        else{
            st.push(ch);
        }
       }
       StringBuilder sb = new StringBuilder();
       for(char ch:st){
        sb.append(ch);
       }
       return sb.toString();
    }
}