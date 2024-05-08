package leetcode.algorithm.ProductOfArrayExceptSelf;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.Stream;

public class SolutionTest {

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution(), new AdvancedSolution());
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithoutZero(Solution solution){
        int[] expected = {24,12,8,6};
        int[] input = {1,2,3,4};
        assertArrayEquals(expected, solution.productOfArrayExceptSelf(input));
    }


    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithZero(Solution solution){
        int[] expected = {0,0,9,0,0};
        int[] input = {-1,1,0,-3,3};
        assertArrayEquals(expected, solution.productOfArrayExceptSelf(input));
    }
}
