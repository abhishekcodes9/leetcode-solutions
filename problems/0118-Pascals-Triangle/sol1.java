// ==========================================================
// 118. Pascal's Triangle
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 1 ms (Beats 96%)
// Memory     : 43 MB (Beats 96%)
// Link       : https://leetcode.com/problems/pascals-triangle/
// ==========================================================


import java.util.*;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < numRows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j <= i; j++) {
                if (j == 0 || j == i) {
                    row.add(1);
                } else {
                    row.add(result.get(i - 1).get(j - 1)
                           + result.get(i - 1).get(j));
                }
            }

            result.add(row);
        }

        return result;
    }
}
