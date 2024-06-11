package leetcode.algorithm.ReverseLinkedList;

public class BasicSolution extends Solution {
    @Override
    public ListNode reverseLinkedList(ListNode head) {

        if (head == null)
            return head;

        ListNode prev = null;
        ListNode cur = head;
        ListNode nextNode = null;

        while (cur != null) {
            nextNode = cur.next;
            cur.next = prev;
            prev = cur;
            cur = nextNode;
        }
        return prev;
    }

}
