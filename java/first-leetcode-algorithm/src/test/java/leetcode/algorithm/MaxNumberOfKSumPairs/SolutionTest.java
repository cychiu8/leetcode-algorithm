package leetcode.algorithm.MaxNumberOfKSumPairs;

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
    public void testAlgorithmWithTwoOperations(Solution solution){
        int expected = 2;
        int[] nums = {1,2,3,4};
        int k = 5;
        assertEquals(expected, solution.maxNumberOfKSumPairs(nums, k)   );
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithOneOperations(Solution solution){
        int expected = 1;
        int[] nums = {3,1,3,4,3};
        int k = 6;
        assertEquals(expected, solution.maxNumberOfKSumPairs(nums, k)   );
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithZeroOperations(Solution solution){
        int expected = 0;
        int[] nums = {1,2,3,4};
        int k = 8;
        assertEquals(expected, solution.maxNumberOfKSumPairs(nums, k)   );
    }
}
