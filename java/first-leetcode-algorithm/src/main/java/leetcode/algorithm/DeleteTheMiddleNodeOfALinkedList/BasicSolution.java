package leetcode.algorithm.DeleteTheMiddleNodeOfALinkedList;

public class BasicSolution extends Solution {
    @Override
    public ListNode deleteTheMiddleNodeOfALinkedList(ListNode head) {

        // time complexity: O(n);
        // space complexity: O(1);

        if (head == null)
            return null;

        // loop the first time to get all number of the nodes
        ListNode cur = head;
        double count = 0.0;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        // calculate the middle index
        double midIdx = Math.floor(count / 2);

        if (midIdx == 0) {
            head = null;
            return head;
        }

        count = 0;
        cur = head;
        // loop the nodes to delete
        while (cur != null) {
            if (count == midIdx - 1) {
                cur.next = cur.next.next;
                break;
            }
            count++;
            cur = cur.next;
        }
        return head;
    }

}
