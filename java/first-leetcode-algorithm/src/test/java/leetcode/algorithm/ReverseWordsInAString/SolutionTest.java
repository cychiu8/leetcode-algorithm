package leetcode.algorithm.ReverseWordsInAString;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

public class SolutionTest {

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution(), new OtherSolution());
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm(Solution solution){
        String expected = "blue is sky the";
        String input = "the sky is blue";
        assertEquals(expected, solution.reverseWordsInAString(input));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithSpaceBeginning(Solution solution) {
        String expected = "world hello";
        String input = "  hello world ";
        assertEquals(expected, solution.reverseWordsInAString(input));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithMultipleSpace(Solution solution){
        String expected = "example good a";
        String input = "a good   example";
        assertEquals(expected, solution.reverseWordsInAString(input));
    }
}
