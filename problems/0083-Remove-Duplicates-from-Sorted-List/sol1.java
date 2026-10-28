// ==========================================================
// 83. Remove Duplicates from Sorted List
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 44.9 MB (Beats 90%)
// Link       : https://leetcode.com/problems/remove-duplicates-from-sorted-list/
// ==========================================================


class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode current = head;

        while (current != null && current.next != null) {
            if (current.val == current.next.val) {
                current.next = current.next.next;
            } else {
                current = current.next;
            }
        }

        return head;
    }
}
