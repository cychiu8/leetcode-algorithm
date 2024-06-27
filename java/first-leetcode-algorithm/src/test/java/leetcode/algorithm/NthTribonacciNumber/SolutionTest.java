package leetcode.algorithm.NthTribonacciNumber;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

/*
 * 1137. NthTribonacciNumber
 */

public class SolutionTest {

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution(), new AdvancedSolution());
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm(Solution solution) {
        assertEquals(4, solution.nthTribonacciNumber(4));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithLargeInput(Solution solution) {
        assertEquals(1389537, solution.nthTribonacciNumber(25));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWith35(Solution solution) {
        assertEquals(615693474, solution.nthTribonacciNumber(35));
    }
}
