package leetcode.algorithm.RemovingStarsFromAString;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

public class SolutionTest {

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution(), new AdvancedSolution());
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm(Solution solution) {
        String expected = "lecoe";
        String s = "leet**cod*e";
        assertEquals(expected, solution.removingStarsFromAString(s));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithEmptyReturn(Solution solution) {
        String expected = "";
        String s = "erase*****";
        assertEquals(expected, solution.removingStarsFromAString(s));
    }
}
