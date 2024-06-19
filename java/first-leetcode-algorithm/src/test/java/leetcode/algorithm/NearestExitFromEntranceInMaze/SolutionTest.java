package leetcode.algorithm.NearestExitFromEntranceInMaze;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

public class SolutionTest {

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution(), new ImprovedSolution());
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm(Solution solution) {
        // Test case 1
        char[][] maze1 = {{'+', '+', '.', '+'}, {'.', '.', '.', '+'}, {'+', '+', '+', '.'}};
        int[] entrance1 = {1, 2};
        int expected1 = 1;
        assertEquals(expected1, solution.nearestExitFromEntranceInMaze(maze1, entrance1));


    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm2(Solution solution) {
        // Test case 2
        char[][] maze2 = {{'+', '+', '+'}, {'.', '.', '.'}, {'+', '+', '+'}};
        int[] entrance2 = {1, 0};
        int expected2 = 2;
        assertEquals(expected2, solution.nearestExitFromEntranceInMaze(maze2, entrance2));


    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithNoExit(Solution solution) {
        // Test case 3
        char[][] maze3 = {{'.'}};
        int[] entrance3 = {0, 0};
        int expected3 = -1;
        assertEquals(expected3, solution.nearestExitFromEntranceInMaze(maze3, entrance3));


    }
}
