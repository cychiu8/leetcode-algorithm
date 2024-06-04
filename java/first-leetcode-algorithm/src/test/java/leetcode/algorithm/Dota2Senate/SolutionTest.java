package leetcode.algorithm.Dota2Senate;

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
        String expected = "Dire";
        String input = "RDD";
        assertEquals(expected, solution.dota2Senate(input));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm2(Solution solution) {
        String expected = "Radiant";
        String input = "RD";
        assertEquals(expected, solution.dota2Senate(input));
    }
}
