// ==========================================================
// 23. Merge k Sorted Lists
// Difficulty : Hard
// Language   : Java
// Solution   : #1
// Runtime    : 4 ms (Beats 80%)
// Memory     : 46.6 MB (Beats 80%)
// Link       : https://leetcode.com/problems/merge-k-sorted-lists/
// ==========================================================

class Solution {
    public ListNode mergeKLists(ListNode[] lists) {
        PriorityQueue<ListNode> pq =
            new PriorityQueue<>((a, b) -> a.val - b.val);

        for (ListNode node : lists)
            if (node != null) pq.add(node);

        ListNode dummy = new ListNode(0);
        ListNode cur = dummy;

        while (!pq.isEmpty()) {
            ListNode node = pq.poll();
            cur.next = node;
            cur = node;

            if (node.next != null)
                pq.add(node.next);
        }

        return dummy.next;
    }
}