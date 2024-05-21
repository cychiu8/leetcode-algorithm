package leetcode.algorithm.LongestSubarrayOfOnesAfterDeletingOneElement;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

public class SolutionTest {

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution());
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm(Solution solution) {
        int expected = 3;
        int[] nums = {1, 1, 0, 1};
        assertEquals(expected, solution.longestSubarrayOfOnesAfterDeletingOneElement(nums));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithAllOne(Solution solution) {
        int expected = 2;
        int[] nums = {1, 1, 1};
        assertEquals(expected, solution.longestSubarrayOfOnesAfterDeletingOneElement(nums));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithMultipleSpot(Solution solution) {
        int expected = 2;
        int[] nums = {1, 1, 0, 0, 1, 0, 1, 0, 0, 1};
        assertEquals(expected, solution.longestSubarrayOfOnesAfterDeletingOneElement(nums));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithExtend(Solution solution) {
        int expected = 5;
        int[] nums = {0, 1, 1, 1, 0, 1, 1, 0, 1};
        assertEquals(expected, solution.longestSubarrayOfOnesAfterDeletingOneElement(nums));
    }
}
