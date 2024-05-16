package leetcode.algorithm.MaximumAverageSubarrayI;

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
        double expected = 12.75000;
        int[] nums = {1, 12, -5, -6, 50, 3};
        int k = 4;
        assertEquals(expected, solution.maximumAverageSubarrayI(nums, k));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithOneElement(Solution solution) {
        double expected = 5.000000;
        int[] nums = {5};
        int k = 1;
        assertEquals(expected, solution.maximumAverageSubarrayI(nums, k));
    }
}
