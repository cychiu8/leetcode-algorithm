package leetcode.algorithm.FindTheHighestAltitude;

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
        int expected = 1;
        int[] gain = {-5, 1, 5, 0, -7};
        assertEquals(expected, solution.findTheHighestAltitude(gain));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithNegative(Solution solution) {
        int expected = 0;
        int[] gain = {-4, -3, -2, -1, 4, 3, 2};
        assertEquals(expected, solution.findTheHighestAltitude(gain));
    }
}
