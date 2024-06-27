package leetcode.algorithm.CombinationSumIII;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/*
 * 216. CombinationSumIII
 */

public class SolutionTest {

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution());
    }


    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm(Solution solution) {
        int k = 3, n = 7;
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1, 2, 4));
        assertEquals(expected, solution.combinationSumIII(k, n));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithK3N9(Solution solution) {
        int k = 3, n = 9;
        List<List<Integer>> expected = Arrays.asList(Arrays.asList(1, 2, 6), Arrays.asList(1, 3, 5),
                Arrays.asList(2, 3, 4));
        assertEquals(expected, solution.combinationSumIII(k, n));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithK4N1(Solution solution) {
        int k = 4, n = 1;
        List<List<Integer>> expected = Collections.emptyList();
        assertEquals(expected, solution.combinationSumIII(k, n));
    }
}
