class Solution {
    public int pivotIndex(int[] nums) {
        int totalSum=0;
        for(int i=0;i<nums.length;i++){
            totalSum+=nums[i];
        }
        int leftSum=0;
        for(int pi=0;pi<nums.length;pi++){
            int RightSum = totalSum-leftSum-nums[pi];

            if(leftSum==RightSum){
                return pi;
            }
            leftSum+=nums[pi];
        }
        return -1;
    }
}
