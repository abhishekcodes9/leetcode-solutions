// ==========================================================
// 43. Multiply Strings
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 3 ms (Beats 79%)
// Memory     : 43.5 MB (Beats 79%)
// Link       : https://leetcode.com/problems/multiply-strings/
// ==========================================================

class Solution {
    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";

        int n = num1.length(), m = num2.length();
        int[] a = new int[n + m];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = m - 1; j >= 0; j--) {
                int x = (num1.charAt(i) - '0') * (num2.charAt(j) - '0');
                int sum = x + a[i + j + 1];

                a[i + j + 1] = sum % 10;
                a[i + j] += sum / 10;
            }
        }

        StringBuilder ans = new StringBuilder();
        for (int x : a)
            if (ans.length() > 0 || x != 0) ans.append(x);

        return ans.toString();
    }
}