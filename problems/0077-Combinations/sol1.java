// ==========================================================
// 77. Combinations
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 20 ms (Beats 29%)
// Memory     : 97.1 MB (Beats 98%)
// Link       : https://leetcode.com/problems/combinations/
// ==========================================================


import java.util.*;

class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(1, n, k, new ArrayList<>(), result);
        return result;
    }

    void backtrack(int start, int n, int k,
                   List<Integer> current,
                   List<List<Integer>> result) {

        if (current.size() == k) {
            result.add(new ArrayList<>(current));
            return;
        }

        for (int i = start; i <= n; i++) {
            current.add(i);

            backtrack(i + 1, n, k, current, result);

            current.remove(current.size() - 1);
        }
    }
}
