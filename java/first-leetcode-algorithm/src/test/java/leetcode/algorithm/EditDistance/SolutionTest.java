package leetcode.algorithm.EditDistance;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

/*
 * 72. EditDistance
 */

public class SolutionTest {

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution(), new AdvancedSolution());
    }
    static Stream<Solution> advancedSolutions() {
        return Stream.of(new AdvancedSolution());
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm(Solution solution) {
        assertEquals(3, solution.editDistance("horse", "ros"));

    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithIntentionAndExecution(Solution solution) {
        assertEquals(5, solution.editDistance("intention", "execution"));
    }

    @ParameterizedTest
    @MethodSource("advancedSolutions")
    public void testAlgorithmWithTimeLimit(Solution solution) {
        assertEquals(6, solution.editDistance("dinitrophenylhydrazine", "acetylphenylhydrazine"));
    }
}
