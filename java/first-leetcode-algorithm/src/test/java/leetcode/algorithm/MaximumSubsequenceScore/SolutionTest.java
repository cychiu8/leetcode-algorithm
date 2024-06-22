package leetcode.algorithm.MaximumSubsequenceScore;

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
        int[] nums1 = {1, 3, 3, 2};
        int[] nums2 = {2, 1, 3, 4};
        int k = 3;
        int expected = 12;
        assertEquals(expected, solution.maximumSubsequenceScore(nums1, nums2, k));

    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithOneElementSelected(Solution solution) {
        int[] nums1 = {4, 2, 3, 1, 1};
        int[] nums2 = {7, 5, 10, 9, 6};
        int k = 1;
        int expected = 30;
        assertEquals(expected, solution.maximumSubsequenceScore(nums1, nums2, k));

    }
}
