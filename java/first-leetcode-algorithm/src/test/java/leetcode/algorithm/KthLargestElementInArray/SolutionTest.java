package leetcode.algorithm.KthLargestElementInArray;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

public class SolutionTest {

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution(), new SelfHeapSolution());
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testCase1(Solution solution) {
        int[] nums1 = {3, 2, 1, 5, 6, 4};
        int k1 = 2;
        int expected1 = 5;
        assertEquals(expected1, solution.kthLargestElementInArray(nums1, k1));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testCase2(Solution solution) {
        int[] nums2 = {3, 2, 3, 1, 2, 4, 5, 5, 6};
        int k2 = 4;
        int expected2 = 4;
        assertEquals(expected2, solution.kthLargestElementInArray(nums2, k2));
    }
}
