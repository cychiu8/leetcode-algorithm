package leetcode.algorithm.LongestCommonSubsequence;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

/*
 * 1143. LongestCommonSubsequence
 */

public class SolutionTest {

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution());
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm(Solution solution){
        assertEquals(3, solution.longestCommonSubsequence("abcde", "ace"));
    }
    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithIdenticalStrings(Solution solution){
        assertEquals(3, solution.longestCommonSubsequence("abc", "abc"));
    }
    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithNoCommonSubsequence(Solution solution){
        assertEquals(0, solution.longestCommonSubsequence("abc", "def"));
    }
}
