package leetcode.algorithm.StringCompression;

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
        int expected = 6;
        char[] expectedArray = {'a','2','b','2','c','3'};
        char[] inputs = {'a','a','b','b','c','c','c'};
        assertEquals(expected, solution.stringCompression(inputs));
        // assertArrayEquals(expectedArray, inputs);
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithOneElement(Solution solution){
        int expected = 1;
        char[] expectedArray = {'a'};
        char[] inputs = {'a'};
        assertEquals(expected, solution.stringCompression(inputs));
        // assertArrayEquals(expectedArray, inputs);
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithNumberOfElementsLargerThanTen(Solution solution){
        int expected = 4;
        char[] expectedArray = {'a','b','1','2'};
        char[] inputs = {'a','b','b','b','b','b','b','b','b','b','b','b','b'};
        assertEquals(expected, solution.stringCompression(inputs));
        // assertArrayEquals(expectedArray, inputs);
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithTwoSameElement(Solution solution){
        int expected = 2;
        char[] expectedArray = {'a','2'};
        char[] inputs = {'a','a'};
        assertEquals(expected, solution.stringCompression(inputs));
        // assertArrayEquals(expectedArray, inputs);
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithThreeDiffElement(Solution solution){
        int expected = 3;
        char[] expectedArray = {'a','b','c'};
        char[] inputs = {'a','b','c'};
        assertEquals(expected, solution.stringCompression(inputs));
        // assertArrayEquals(expectedArray, inputs);
    }
}
