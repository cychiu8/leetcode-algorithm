package leetcode.algorithm.AsteroidCollision;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.stream.Stream;

public class SolutionTest {

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution());
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithCollide(Solution solution) {
        int[] input = {5, 10, -5};
        int[] expected = {5, 10};
        assertArrayEquals(expected, solution.asteroidCollision(input));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithEmptyResponse(Solution solution) {
        int[] input = {8, -8};
        int[] expected = {};
        assertArrayEquals(expected, solution.asteroidCollision(input));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithOneLeft(Solution solution) {
        int[] input = {10, 2, -5};
        int[] expected = {10};
        assertArrayEquals(expected, solution.asteroidCollision(input));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithOppsite(Solution solution) {
        int[] input = {-2, -2, -2, 1};
        int[] expected = {-2, -2, -2, 1};
        assertArrayEquals(expected, solution.asteroidCollision(input));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithOppsiteInMiddle(Solution solution) {
        int[] input = {-2, 1, -2, -2};
        int[] expected = {-2, -2, -2};
        assertArrayEquals(expected, solution.asteroidCollision(input));
    }
}
