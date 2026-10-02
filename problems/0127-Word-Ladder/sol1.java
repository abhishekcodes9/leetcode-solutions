// ==========================================================
// 127. Word Ladder
// Difficulty : Hard
// Language   : Java
// Solution   : #1
// Runtime    : 102 ms (Beats 23%)
// Memory     : 47.9 MB (Beats 58%)
// Link       : https://leetcode.com/problems/word-ladder/
// ==========================================================

class Solution {
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        if (!set.contains(endWord)) return 0;

        Queue<String> q = new LinkedList<>();
        q.offer(beginWord);
        int level = 1;

        while (!q.isEmpty()) {
            int size = q.size();

            while (size-- > 0) {
                char[] a = q.poll().toCharArray();

                for (int i = 0; i < a.length; i++) {
                    char old = a[i];

                    for (char c = 'a'; c <= 'z'; c++) {
                        if (c == old) continue;

                        a[i] = c;
                        String s = new String(a);

                        if (s.equals(endWord)) return level + 1;

                        if (set.remove(s))
                            q.offer(s);
                    }

                    a[i] = old;
                }
            }

            level++;
        }

        return 0;
    }
}