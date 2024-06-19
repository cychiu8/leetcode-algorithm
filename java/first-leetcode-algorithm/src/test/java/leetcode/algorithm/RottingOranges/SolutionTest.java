package leetcode.algorithm.RottingOranges;

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
    public void testCase1(Solution solution) {
        int[][] grid1 = {{2, 1, 1}, {1, 1, 0}, {0, 1, 1}};
        int expected1 = 4;
        assertEquals(expected1, solution.rottingOranges(grid1));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testCase2(Solution solution) {
        int[][] grid2 = {{2, 1, 1}, {0, 1, 1}, {1, 0, 1}};
        int expected2 = -1;
        assertEquals(expected2, solution.rottingOranges(grid2));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testCase3(Solution solution) {
        int[][] grid3 = {{0, 2}};
        int expected3 = 0;
        assertEquals(expected3, solution.rottingOranges(grid3));
    }
}
