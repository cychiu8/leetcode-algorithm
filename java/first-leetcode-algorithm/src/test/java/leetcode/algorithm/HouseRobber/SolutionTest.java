package leetcode.algorithm.HouseRobber;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

/*
 * 198. HouseRobber
 */

public class SolutionTest {

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution());
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm(Solution solution) {
        assertEquals(4, solution.houseRobber(new int[] {1, 2, 3, 1}));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm2(Solution solution) {
        assertEquals(12, solution.houseRobber(new int[] {2, 7, 9, 3, 1}));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithWithEmpty(Solution solution) {
        assertEquals(0, solution.houseRobber(new int[] {}));
    }
}
