// ==========================================================
// 46. Permutations
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 45.5 MB (Beats 46%)
// Link       : https://leetcode.com/problems/permutations/
// ==========================================================

class Solution {
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        backtrack(nums, 0, ans);
        return ans;
    }

    void backtrack(int[] a, int i, List<List<Integer>> ans) {
        if (i == a.length) {
            List<Integer> list = new ArrayList<>();
            for (int x : a) list.add(x);
            ans.add(list);
            return;
        }

        for (int j = i; j < a.length; j++) {
            int t = a[i];
            a[i] = a[j];
            a[j] = t;

            backtrack(a, i + 1, ans);

            t = a[i];
            a[i] = a[j];
            a[j] = t;
        }
    }
}