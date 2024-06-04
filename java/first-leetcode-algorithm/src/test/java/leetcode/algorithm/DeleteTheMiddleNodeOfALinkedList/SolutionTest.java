package leetcode.algorithm.DeleteTheMiddleNodeOfALinkedList;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

public class SolutionTest {

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution(), new AdvancedSolution());
    }

    private ListNode createLinkedListByList(int[] list) {
        ListNode head = null;
        ListNode tail = head;
        for (int i = 0; i < list.length; i++) {
            ListNode newNode = new ListNode(list[i]);
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

        if (head == null)
            return 0;

        ListNode cur = head;
        int count = 0;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm(Solution solution) {
        int[] inputList = {1, 3, 4, 7, 1, 2, 6};
        ListNode input = createLinkedListByList(inputList);
        int[] expectedList = {1, 3, 4, 1, 2, 6};
        ListNode expected = createLinkedListByList(expectedList);

        ListNode curExpct = expected;
        ListNode curReturn = solution.deleteTheMiddleNodeOfALinkedList(input);
        assertEquals(inputList.length - 1, lengthOfLinkedList(curReturn));

        while (curExpct != null) {
            assertEquals(curExpct.val, curReturn.val);
            curExpct = curExpct.next;
            curReturn = curReturn.next;
        }

    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm2(Solution solution) {
        int[] inputList = {1, 2, 3, 4};
        ListNode input = createLinkedListByList(inputList);
        int[] expectedList = {1, 2, 4};
        ListNode expected = createLinkedListByList(expectedList);

        ListNode curExpct = expected;
        ListNode curReturn = solution.deleteTheMiddleNodeOfALinkedList(input);
        assertEquals(inputList.length - 1, lengthOfLinkedList(curReturn));

        while (curExpct != null) {
            assertEquals(curExpct.val, curReturn.val);
            curExpct = curExpct.next;
            curReturn = curReturn.next;
        }

    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm3(Solution solution) {
        int[] inputList = {2, 1};
        ListNode input = createLinkedListByList(inputList);
        int[] expectedList = {2};
        ListNode expected = createLinkedListByList(expectedList);

        ListNode curExpct = expected;
        ListNode curReturn = solution.deleteTheMiddleNodeOfALinkedList(input);
        assertEquals(inputList.length - 1, lengthOfLinkedList(curReturn));

        while (curExpct != null) {
            assertEquals(curExpct.val, curReturn.val);
            curExpct = curExpct.next;
            curReturn = curReturn.next;
        }

    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithOneElement(Solution solution) {
        int[] inputList = {1};
        ListNode input = createLinkedListByList(inputList);
        int[] expectedList = {};
        ListNode expected = createLinkedListByList(expectedList);

        ListNode curExpct = expected;
        ListNode curReturn = solution.deleteTheMiddleNodeOfALinkedList(input);
        assertEquals(inputList.length - 1, lengthOfLinkedList(curReturn));

        while (curExpct != null) {
            assertEquals(curExpct.val, curReturn.val);
            curExpct = curExpct.next;
            curReturn = curReturn.next;
        }

    }
}
