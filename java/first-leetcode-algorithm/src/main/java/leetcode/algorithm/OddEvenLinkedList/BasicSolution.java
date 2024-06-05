package leetcode.algorithm.OddEvenLinkedList;

public class BasicSolution extends Solution {
    @Override
    public ListNode oddEvenLinkedList(ListNode head) {

        // must solve in
        // extra space complexity: O(1)
        // time complexity: O(n)

        // a pointer to memory even nodes and connect
        // when the odd part all go through then connect to the head of even nodes

        if (head == null)
            return null;

        ListNode evenHead = head.next;
        ListNode evenCur = evenHead;
        ListNode oddCur = head;

        while (evenCur != null && evenCur.next != null) {
            oddCur.next = evenCur.next;
            evenCur.next = evenCur.next.next;

            oddCur = oddCur.next;
            evenCur = evenCur.next;

        }

        oddCur.next = evenHead;

        ListNode cur = head;
        while (cur != null) {
            System.out.print(cur.val);
            System.out.print("->");
            cur = cur.next;
        }
        System.out.println();

        return head;
    }

}
