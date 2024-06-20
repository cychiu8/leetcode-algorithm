package leetcode.algorithm.DetermineIfTwoStringsAreClose;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.stream.Stream;

public class SolutionTest {

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution(), new AdvancedSolution());
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmTrueWithR1(Solution solution) {
        String word1 = "abc";
        String word2 = "bca";
        assertTrue(solution.determineIfTwoStringsAreClose(word1, word2));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmTrueWithMixedRule(Solution solution) {
        String word1 = "cabbba";
        String word2 = "abbccc";
        assertTrue(solution.determineIfTwoStringsAreClose(word1, word2));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmFalse(Solution solution) {
        String word1 = "a";
        String word2 = "aa";
        assertFalse(solution.determineIfTwoStringsAreClose(word1, word2));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmFalseWithDiffOcc(Solution solution) {
        String word1 = "cabbba";
        String word2 = "aabbss";
        assertFalse(solution.determineIfTwoStringsAreClose(word1, word2));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmFalseWithDiffChar(Solution solution) {
        String word1 = "uau";
        String word2 = "ssx";
        assertFalse(solution.determineIfTwoStringsAreClose(word1, word2));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmFalseWithDiff(Solution solution) {
        String word1 = "aaabbbbccddeeeeefffff";
        String word2 = "aaaaabbcccdddeeeeffff";
        assertFalse(solution.determineIfTwoStringsAreClose(word1, word2));
    }

}
