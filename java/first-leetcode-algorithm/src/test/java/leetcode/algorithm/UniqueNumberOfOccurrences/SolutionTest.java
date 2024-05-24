package leetcode.algorithm.UniqueNumberOfOccurrences;

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
    public void testAlgorithmWithTrue(Solution solution) {
        int[] inputs = {1, 2, 2, 1, 1, 3};
        assertEquals(true, solution.uniqueNumberOfOccurrences(inputs));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithFalse(Solution solution) {
        int[] inputs = {1, 2};
        assertEquals(false, solution.uniqueNumberOfOccurrences(inputs));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithNegative(Solution solution) {
        int[] inputs = {-3, 0, 1, -3, 1, 1, 1, -3, 10, 0};
        assertEquals(true, solution.uniqueNumberOfOccurrences(inputs));
    }

}
