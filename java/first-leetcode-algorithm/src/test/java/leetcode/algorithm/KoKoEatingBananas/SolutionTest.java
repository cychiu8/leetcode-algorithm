package leetcode.algorithm.KoKoEatingBananas;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

/*
 * 875. KoKoEatingBananas
 */

public class SolutionTest {

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution());
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm(Solution solution) {
        int[] piles = {3, 6, 7, 11};
        int h = 8;
        int expected = 4;
        assertEquals(expected, solution.koKoEatingBananas(piles, h));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithDifferentInput(Solution solution) {
        int[] piles = {30, 11, 23, 4, 20};
        int h = 5;
        int expected = 30;
        assertEquals(expected, solution.koKoEatingBananas(piles, h));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithLargeInput(Solution solution) {
        int[] piles = {805306368, 805306368, 805306368};
        int h = 1000000000;
        int expected = 3;
        assertEquals(expected, solution.koKoEatingBananas(piles, h));
    }
}
