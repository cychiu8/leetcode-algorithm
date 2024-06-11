package leetcode.algorithm.ReverseLinkedList;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import org.opentest4j.AssertionFailedError;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

public class SolutionTest {

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution());
    }

    private ListNode createLinkedListByList(int[] list) {
        ListNode head = null;
        ListNode tail = head;
        for (int val : list) {
            ListNode newNode = new ListNode(val);
            if (head == null) {
                head = newNode;
                tail = head;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
        }
        return head;
    }

    private int lengthOfLinkedList(ListNode head) {
        int len = 0;
        ListNode cur = head;
        while (cur != null) {
            len++;
            cur = cur.next;
        }
        return len;
    }

    private void assertEqualsTwoLinkedList(ListNode h1, ListNode h2) {
        ListNode cur1 = h1;
        ListNode cur2 = h2;
        while (cur1 != null && cur2 != null) {
            assertEquals(cur1.val, cur2.val);
            cur1 = cur1.next;
            cur2 = cur2.next;
        }
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm(Solution solution) {
        int[] list = {1, 2, 3, 4, 5};
        ListNode head = createLinkedListByList(list);
        int[] expectedList = {5, 4, 3, 2, 1};
        ListNode expected = createLinkedListByList(expectedList);
        assertEqualsTwoLinkedList(expected, solution.reverseLinkedList(head));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithTwoElements(Solution solution) {
        int[] list = {1, 2};
        ListNode head = createLinkedListByList(list);
        int[] expectedList = {2, 1};
        ListNode expected = createLinkedListByList(expectedList);
        assertEqualsTwoLinkedList(expected, solution.reverseLinkedList(head));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithNull(Solution solution) {
        int[] list = {};
        ListNode head = createLinkedListByList(list);
        int[] expectedList = {};
        ListNode expected = createLinkedListByList(expectedList);
        assertEqualsTwoLinkedList(expected, solution.reverseLinkedList(head));
    }
}
