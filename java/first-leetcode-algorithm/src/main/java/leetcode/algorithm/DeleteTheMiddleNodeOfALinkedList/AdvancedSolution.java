package leetcode.algorithm.DeleteTheMiddleNodeOfALinkedList;

public class AdvancedSolution extends Solution {
    @Override
    public ListNode deleteTheMiddleNodeOfALinkedList(ListNode head) {
        // three pointers for slow(mid), prev and fast
        ListNode slow, prev, fast = null;
        ListNode dummyHead = new ListNode(-1, head);

        slow = fast = head;
        prev = dummyHead;

        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = prev.next.next;
        slow = null;

        return dummyHead.next;
    }

}
