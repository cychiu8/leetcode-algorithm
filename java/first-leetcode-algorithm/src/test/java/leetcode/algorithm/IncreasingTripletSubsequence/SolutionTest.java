package leetcode.algorithm.IncreasingTripletSubsequence;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.stream.Stream;

public class SolutionTest {

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution(), new AdvancedSolution());
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithAscending(Solution solution) {
        int[] input = {1, 2, 3, 4, 5};
        assertTrue(solution.increasingTripletSubsequence(input));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithDescending(Solution solution) {
        int[] input = {5, 4, 3, 2, 1};
        assertFalse(solution.increasingTripletSubsequence(input));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm(Solution solution) {
        int[] input = {2, 1, 5, 0, 4, 6};
        assertTrue(solution.increasingTripletSubsequence(input));
    }
}
