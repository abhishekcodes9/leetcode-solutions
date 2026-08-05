class Solution {
    public int findGCD(int[] nums) {
        int min = nums[0];
        int max = nums[0];
        int gcd = 1;
        for(int i=0; i<nums.length; i++){
            if(nums[i]<=min){
                min = nums[i];
            }
            else if(nums[i]>=max){
                max = nums[i];
            }
        }
        for(int j=2; j<=min; j++){
            if(min%j==0 && max%j==0){
                gcd = j;
            }
        }
        return gcd;
    }
}
