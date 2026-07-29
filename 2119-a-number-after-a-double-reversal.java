class Solution {
    public boolean isSameAfterReversals(int num) {
        if(num>9){
            int digit = num%10;
            if(digit==0){
                return false;
            }    
        }
        return true;
    }
}
