package leetcode.algorithm.FindPivotIndex;

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
        int[] nums = {1, 7, 3, 6, 5, 6};
        assertEquals(expected, solution.findPivotIndex(nums));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithNoPivot(Solution solution) {
        int expected = -1;
        int[] nums = {1, 2, 3};
        assertEquals(expected, solution.findPivotIndex(nums));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithLeftmostPivot(Solution solution) {
        int expected = 0;
        int[] nums = {2, 1, -1};
        assertEquals(expected, solution.findPivotIndex(nums));
    }
}
