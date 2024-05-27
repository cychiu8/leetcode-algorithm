package leetcode.algorithm.EqualRowAndColumnPairs;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

public class SolutionTest {

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution(), new AdvancedSolution());
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithThreeMatrix(Solution solution) {
        int expected = 1;
        int[][] input = {{3, 2, 1}, {1, 7, 6}, {2, 7, 7}};
        assertEquals(expected, solution.equalRowAndColumnPairs(input));
    }


    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithFourMatrix(Solution solution) {
        int expected = 3;
        int[][] input = {{3, 1, 2, 2}, {1, 4, 4, 5}, {2, 4, 2, 2}, {2, 4, 2, 2}};
        assertEquals(expected, solution.equalRowAndColumnPairs(input));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithNone(Solution solution) {
        int expected = 0;
        int[][] input = {{2, 1}, {3, 32}};
        assertEquals(expected, solution.equalRowAndColumnPairs(input));
    }
}
