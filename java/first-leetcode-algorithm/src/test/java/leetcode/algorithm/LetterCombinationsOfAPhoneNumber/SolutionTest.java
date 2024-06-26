package leetcode.algorithm.LetterCombinationsOfAPhoneNumber;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

/*
 * 17. LetterCombinationsOfAPhoneNumber
 */

public class SolutionTest {

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution(), new AdvancedSolution());
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm(Solution solution) {
        String digits = "23";
        List<String> expected = Arrays.asList("ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf");
        assertEquals(expected, solution.letterCombinationsOfAPhoneNumber(digits));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithEmptyInput(Solution solution) {
        String digits = "";
        List<String> expected = Collections.emptyList();
        assertEquals(expected, solution.letterCombinationsOfAPhoneNumber(digits));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithSingleDigit(Solution solution) {
        String digits = "2";
        List<String> expected = Arrays.asList("a", "b", "c");
        assertEquals(expected, solution.letterCombinationsOfAPhoneNumber(digits));
    }
}
