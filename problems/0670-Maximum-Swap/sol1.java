// ==========================================================
// 670. Maximum Swap
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 65%)
// Memory     : 41.6 MB (Beats 98%)
// Link       : https://leetcode.com/problems/maximum-swap/
// ==========================================================


class Solution {
    public int maximumSwap(int num) {
        char[] arr = String.valueOf(num).toCharArray();
        int n = arr.length;

        int[] last = new int[10];

        for (int i = 0; i < n; i++) {
            last[arr[i] - '0'] = i;
        }

        for (int i = 0; i < n; i++) {
            for (int d = 9; d > arr[i] - '0'; d--) {
                if (last[d] > i) {
                    char temp = arr[i];
                    arr[i] = arr[last[d]];
                    arr[last[d]] = temp;

                    return Integer.parseInt(new String(arr));
                }
            }
        }

        return num;
    }
}
