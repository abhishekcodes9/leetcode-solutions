class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder sb = new StringBuilder();
        int count=0;

        for(int i=0; i<s.length();i++){
            char ch = s.charAt(i);

            if(ch==')'){
                if(count==0){
                    continue;
                }
                count--;
            }
            else if(ch=='('){
                count++;
            }

            sb.append(ch);
        }

        StringBuilder ans = new StringBuilder();

        for(int i=sb.length()-1; i>=0; i--){
            char ch = sb.charAt(i);

            if(ch=='(' && count>0){
                count--;
                continue;
            }

            ans.append(ch);
        }

        return ans.reverse().toString();
    }
}