class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char[] sArr1 =  new char[s.length()];
        char[] sArr2 =  new char[t.length()];

        for(int i=0;i<s.length();i++){
            sArr1[i]=s.charAt(i);
        }

        for(int i=0;i<t.length();i++){
            sArr2[i] = t.charAt(i);
        }

        Arrays.sort(sArr1);
        Arrays.sort(sArr2);

        for(int i=0;i<sArr1.length;i++){
            if(sArr1[i] != sArr2[i]){
                return false;
            }
        }
        return true;
    }
}
