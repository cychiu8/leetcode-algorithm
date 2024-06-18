package leetcode.algorithm.ReorderRoutes;

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
    public void testAlgorithmWithTwoPaths(Solution solution) {
        int[][] connections = {{0, 1}, {1, 3}, {2, 3}, {4, 0}, {4, 5}};
        int n = 6;
        int expected = 3;
        assertEquals(expected, solution.reorderRoutes(n, connections));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithOnePath(Solution solution) {
        int[][] connections = {{1, 0}, {1, 2}, {3, 2}, {3, 4}};
        int n = 5;
        int expected = 2;
        assertEquals(expected, solution.reorderRoutes(n, connections));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithNoChange(Solution solution) {
        int[][] connections = {{1, 0}, {2, 0}};
        int n = 3;
        int expected = 0;
        assertEquals(expected, solution.reorderRoutes(n, connections));
    }
}
