// ==========================================================
// 61. Rotate List
// Difficulty : Medium
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 44.3 MB (Beats 44%)
// Link       : https://leetcode.com/problems/rotate-list/
// ==========================================================

class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if (head == null || head.next == null || k == 0)
            return head;

        int n = 1;
        ListNode tail = head;

        while (tail.next != null) {
            tail = tail.next;
            n++;
        }

        k %= n;
        if (k == 0) return head;

        tail.next = head;

        for (int i = 0; i < n - k; i++)
            tail = tail.next;

        head = tail.next;
        tail.next = null;

        return head;
    }
}