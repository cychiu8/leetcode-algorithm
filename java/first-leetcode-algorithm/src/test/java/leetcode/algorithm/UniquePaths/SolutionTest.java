package leetcode.algorithm.UniquePaths;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

/*
 * 62. UniquePaths
 */

public class SolutionTest {

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution());
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm(Solution solution){
        assertEquals(28, solution.uniquePaths(3, 7));
    }

        @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm2(Solution solution){
        assertEquals(3, solution.uniquePaths(3, 2));
    }
}
