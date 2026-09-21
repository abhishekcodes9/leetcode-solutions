import java.util.*;

class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();

        if (digits.length() == 0) {
            return ans;
        }

        String[] map = {
            "", "", "abc", "def",
            "ghi", "jkl", "mno",
            "pqrs", "tuv", "wxyz"
        };

        backtrack(digits, 0, new StringBuilder(), ans, map);

        return ans;
    }

    void backtrack(String digits, int index,
                   StringBuilder current,
                   List<String> ans,
                   String[] map) {

        if (index == digits.length()) {
            ans.add(current.toString());
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for (char ch : letters.toCharArray()) {
            current.append(ch);

            backtrack(digits, index + 1, current, ans, map);

            current.deleteCharAt(current.length() - 1);
        }
    }
}
