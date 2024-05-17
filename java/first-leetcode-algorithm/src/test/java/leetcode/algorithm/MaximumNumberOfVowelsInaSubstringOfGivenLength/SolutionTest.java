package leetcode.algorithm.MaximumNumberOfVowelsInaSubstringOfGivenLength;

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
    public void testAlgorithmEqualsToK(Solution solution) {
        int expected = 3;
        String s = "abciiidef";
        int k = 3;
        assertEquals(expected, solution.maximumNumberOfVowelsInaSubstringOfGivenLength(s, k));
    }


    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmAnySubstring(Solution solution) {
        int expected = 2;
        String s = "aeiou";
        int k = 2;
        assertEquals(expected, solution.maximumNumberOfVowelsInaSubstringOfGivenLength(s, k));
    }


    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmLessThanK(Solution solution) {
        int expected = 2;
        String s = "leetcode";
        int k = 2;
        assertEquals(expected, solution.maximumNumberOfVowelsInaSubstringOfGivenLength(s, k));
    }


    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmNoMatch(Solution solution) {
        int expected = 0;
        String s = "cccc";
        int k = 2;
        assertEquals(expected, solution.maximumNumberOfVowelsInaSubstringOfGivenLength(s, k));
    }
}

