class Solution {
    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        
        String prefix = strs[0]; // assume first word is the answer
        
        for (int i = 1; i < strs.length; i++) {
            int j = 0;
            // compare character by character
            while (j < prefix.length() && j < strs[i].length() && prefix.charAt(j) == strs[i].charAt(j)) {
                j++;
            }
            prefix = prefix.substring(0, j); // shrink prefix to matching part
        }
        
        return prefix;
    }
}
