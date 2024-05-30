package leetcode.algorithm.DecodeString;

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
        String expected = "aaabcbc";
        String input = "3[a]2[bc]";
        assertEquals(expected, solution.decodeString(input));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmNest(Solution solution) {
        String expected = "accaccacc";
        String input = "3[a2[c]]";
        assertEquals(expected, solution.decodeString(input));
    }


    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithNoneEncode(Solution solution) {
        String expected = "abcabccdcdcdef";
        String input = "2[abc]3[cd]ef";
        assertEquals(expected, solution.decodeString(input));
    }
}
