package leetcode.algorithm.NumberOfProvinces;

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
        int[][] isConnected = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        int expected = 2;
        assertEquals(expected, solution.numberOfProvinces(isConnected));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithNoConnected(Solution solution) {
        int[][] isConnected = {{1, 0, 0}, {0, 1, 0}, {0, 0, 1}};
        int expected = 3;
        assertEquals(expected, solution.numberOfProvinces(isConnected));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithFullyConnected(Solution solution) {
        int[][] isConnected = {{1, 0, 0, 1}, {0, 1, 1, 0}, {0, 1, 1, 1}, {1, 0, 1, 1}};
        int expected = 1;
        assertEquals(expected, solution.numberOfProvinces(isConnected));
    }
}
