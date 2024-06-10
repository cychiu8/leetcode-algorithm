package leetcode.algorithm.MaximumTwinSumOfALinkedList;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import java.util.stream.Stream;

public class SolutionTest {

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution());
    }

    private ListNode createLinkedListByList(int[] list) {
        ListNode head = null;
        ListNode cur = head;
        for (int num : list) {
            ListNode newNode = new ListNode(num);
            if (head == null) {
                head = newNode;
                cur = head;
            } else {
                cur.next = newNode;
                cur = cur.next;
            }
        }
        return head;
    }

    private int lengthOfLinkedList(ListNode head) {
        int count = 0;
        if (head == null)
            return count;

        ListNode cur = head;
        while (cur != null) {
            cur = cur.next;
            count++;
        }
        return count;
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm(Solution solution) {
        int[] list = {5, 4, 2, 1};
        ListNode input = createLinkedListByList(list);
        int expected = 6;
        assertEquals(expected, solution.maximumTwinSumOfALinkedList(input));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithTwoElements(Solution solution) {
        int[] list = {1, 100000};
        ListNode input = createLinkedListByList(list);
        int expected = 100001;
        assertEquals(expected, solution.maximumTwinSumOfALinkedList(input));
    }
}
