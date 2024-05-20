package leetcode.algorithm.MaxConsecutiveOnesIII;

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
        int expected = 6;
        int[] nums = {1, 1, 1, 0, 0, 0, 1, 1, 1, 1, 0};
        int k = 2;
        assertEquals(expected, solution.maxConsecutiveOnesIII(nums, k));
    }


    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmFlipThreeTimes(Solution solution) {
        int expected = 10;
        int[] nums = {0, 0, 1, 1, 0, 0, 1, 1, 1, 0, 1, 1, 0, 0, 0, 1, 1, 1, 1};
        int k = 3;
        assertEquals(expected, solution.maxConsecutiveOnesIII(nums, k));
    }
}
