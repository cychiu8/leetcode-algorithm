package leetcode.algorithm.CountingBits;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.stream.Stream;

/*
 * 338. CountingBits
 */

public class SolutionTest {

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution(), new AdvancedSolution());
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm(Solution solution) {
        assertArrayEquals(new int[] {0, 1, 1}, solution.countingBits(2));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithInputFive(Solution solution) {
        assertArrayEquals(new int[] {0, 1, 1, 2, 1, 2}, solution.countingBits(5));
    }
}
