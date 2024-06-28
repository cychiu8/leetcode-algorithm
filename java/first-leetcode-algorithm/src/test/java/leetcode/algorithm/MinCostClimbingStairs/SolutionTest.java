package leetcode.algorithm.MinCostClimbingStairs;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

/*
 * 746. MinCostClimbingStairs
 */

public class SolutionTest {

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution(), new TopDownDPSolution(), new BottomUpDPSolution(),
                new AdvancedSolution());
    }


    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm(Solution solution) {
        int[] cost = {10, 15, 20};
        int expected = 15;
        assertEquals(expected, solution.minCostClimbingStairs(cost));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm2(Solution solution) {
        int[] cost = {1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
        int expected = 6;
        assertEquals(expected, solution.minCostClimbingStairs(cost));
    }
}
