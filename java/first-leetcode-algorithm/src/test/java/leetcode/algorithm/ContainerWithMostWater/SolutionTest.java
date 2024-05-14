package leetcode.algorithm.ContainerWithMostWater;

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
    public void testAlgorithm(Solution solution){
        int expected = 49;
        int[] input = {1,8,6,2,5,4,8,3,7};
        assertEquals(expected, solution.containerWithMostWater(input));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithTwoElement(Solution solution) {
        int expected = 1;
        int[] input = {1,1};
        assertEquals(expected, solution.containerWithMostWater(input));
    }
}
