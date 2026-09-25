// ==========================================================
// 21. Merge Two Sorted Lists
// Difficulty : Easy
// Language   : Java
// Solution   : #1
// Runtime    : 0 ms (Beats 100%)
// Memory     : 44.2 MB (Beats 57%)
// Link       : https://leetcode.com/problems/merge-two-sorted-lists/
// ==========================================================

class Solution {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        while (list1 != null && list2 != null) {
            if (list1.val <= list2.val) {
                cur.next = list1;
                list1 = list1.next;
            } else {
                cur.next = list2;
                list2 = list2.next;
            }

            cur = cur.next;
        }

        cur.next = (list1 != null) ? list1 : list2;

        return dummy.next;
    }
}