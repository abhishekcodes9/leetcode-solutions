// ==========================================================
// 125. Valid Palindrome
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 3 ms (Beats 58%)
// Memory     : 43.9 MB (Beats 96%)
// Link       : https://leetcode.com/problems/valid-palindrome/
// ==========================================================


class Solution {
    public boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            char a = s.charAt(left);
            char b = s.charAt(right);

            if (!Character.isLetterOrDigit(a)) {
                left++;
            } else if (!Character.isLetterOrDigit(b)) {
                right--;
            } else {
                if (Character.toLowerCase(a) !=
                    Character.toLowerCase(b)) {
                    return false;
                }

                left++;
                right--;
            }
        }

        return true;
    }
}
