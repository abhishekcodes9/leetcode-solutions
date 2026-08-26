class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length-1;
        for(;left<right;){
            if(arr[left]=='A' || arr[left]=='E' || arr[left]=='I' || arr[left]=='O' || arr[left]=='U' || arr[left]=='a' || arr[left]=='e' || arr[left]=='i' || arr[left]=='o' || arr[left]=='u'){
                if(arr[right]=='A' || arr[right]=='E' || arr[right]=='I' || arr[right]=='O' || arr[right]=='U' || arr[right]=='a' || arr[right]=='e' || arr[right]=='i' || arr[right]=='o' || arr[right]=='u'){
                    char temp = arr[right];
                    arr[right]= arr[left];
                    arr[left] = temp;
                    left++;
                    right--;
                }
                else{
                    right--;
                }
                }
            else{
                left++;
            }
        }
        return new String(arr);
    }
}
