// ==========================================================
// 2390. Removing Stars From a String
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 73 ms (Beats 39%)
// Memory     : 47.5 MB (Beats 83%)
// Link       : https://leetcode.com/problems/removing-stars-from-a-string/
// ==========================================================

class Solution {
    public String removeStars(String s) {
        Stack <Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='*'){
                if(!st.isEmpty()){
                    st.pop();
                }
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