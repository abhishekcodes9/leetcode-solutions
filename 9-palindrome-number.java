class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int reverse=0;
        int temp=x;
        for(;temp>0;){
            int digit=temp%10;
            temp/=10;
            reverse = reverse*10+digit;
        }
        if (reverse==x){
            return true;
        }
        else{
            return false;
        }
    }
}
