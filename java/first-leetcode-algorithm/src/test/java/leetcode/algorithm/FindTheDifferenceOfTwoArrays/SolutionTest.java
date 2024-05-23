package leetcode.algorithm.FindTheDifferenceOfTwoArrays;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SolutionTest {

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution(), new AdvancedSolution());
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm(Solution solution) {
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1, 3), Arrays.asList(4, 6));

        int[] nums1 = {1, 2, 3};
        int[] nums2 = {2, 4, 6};

        assertEquals(expected, solution.findTheDifferenceOfTwoArrays(nums1, nums2));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithEmptyResult(Solution solution) {
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(3), Arrays.asList());

        int[] nums1 = {1, 2, 3, 3};
        int[] nums2 = {1, 1, 2, 2};

        assertEquals(expected, solution.findTheDifferenceOfTwoArrays(nums1, nums2));
    }
}
