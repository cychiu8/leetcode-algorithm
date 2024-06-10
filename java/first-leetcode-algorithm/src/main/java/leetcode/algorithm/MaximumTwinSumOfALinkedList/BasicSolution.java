package leetcode.algorithm.MaximumTwinSumOfALinkedList;

public class BasicSolution extends Solution {
    @Override
    public int maximumTwinSumOfALinkedList(ListNode head) {
        // reverse the second half of the linked list

        // use fast & slow pointer to find the middle node
        ListNode slow = head;
        ListNode fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // start to reverse
        ListNode prev = null;
        ListNode nextNode = null;
        while (slow != null) {
            nextNode = slow.next;
            slow.next = prev;
            prev = slow;
            slow = nextNode;
        }

        // loop the two linkedlists
        int max = Integer.MIN_VALUE;
        ListNode cur = head;
        while (cur != null && prev != null) {
            max = Math.max(cur.val + prev.val, max);
            cur = cur.next;
            prev = prev.next;
        }

        return max;
    }

}
