// ==========================================================
// 18. 4Sum
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 16 ms (Beats 93%)
// Memory     : 45.8 MB (Beats 47%)
// Link       : https://leetcode.com/problems/4sum/
// ==========================================================

class Solution {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        int n = nums.length;

        for (int i = 0; i < n - 3; i++) {
            if (i > 0 && nums[i] == nums[i - 1]) continue;

            for (int j = i + 1; j < n - 2; j++) {
                if (j > i + 1 && nums[j] == nums[j - 1]) continue;

                long need = (long) target - nums[i] - nums[j];
                int l = j + 1, r = n - 1;

                while (l < r) {
                    long sum = (long) nums[l] + nums[r];

                    if (sum == need) {
                        ans.add(Arrays.asList(nums[i], nums[j], nums[l], nums[r]));

                        while (l < r && nums[l] == nums[l + 1]) l++;
                        while (l < r && nums[r] == nums[r - 1]) r--;

                        l++;
                        r--;
                    } 
                    else if (sum < need) {
                        l++;
                    } 
                    else {
                        r--;
                    }
                }
            }
        }

        return ans;
    }
}