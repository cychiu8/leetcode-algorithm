package leetcode.algorithm.IncreasingTripletSubsequence;

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
    public void testAlgorithmWithAscending(Solution solution){
        boolean expected = true;
        int[] input = {1,2,3,4,5};
        assertEquals(expected, solution.increasingTripletSubsequence(input));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithDescending(Solution solution){
        boolean expected = false;
        int[] input = {5,4,3,2,1};
        assertEquals(expected, solution.increasingTripletSubsequence(input));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm(Solution solution){
        boolean excepted = true;
        int[] input = {2,1,5,0,4,6};
        assertEquals(excepted, solution.increasingTripletSubsequence(input));
    }
}
