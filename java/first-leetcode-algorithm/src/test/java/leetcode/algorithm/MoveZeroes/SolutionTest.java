package leetcode.algorithm.MoveZeroes;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

public class SolutionTest {

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution());
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm(Solution solution){
        int[] expected = {1,3,12,0,0};
        int[] input = {0,1,0,3,12};
        solution.moveZeroes(input);
        assertArrayEquals(expected, input);
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmOnlyZero(Solution solution){
        int[] expected = {0};
        int[] input = {0};
        solution.moveZeroes(input);
        assertArrayEquals(expected, input);
    }
}
