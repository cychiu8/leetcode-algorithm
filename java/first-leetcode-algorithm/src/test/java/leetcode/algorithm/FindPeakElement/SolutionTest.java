package leetcode.algorithm.FindPeakElement;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;
import java.util.stream.Stream;

public class SolutionTest {

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution());
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm(Solution solution) {
        int[] nums = {1, 2, 3, 1};
        int expected = 2;
        assertEquals(expected, solution.findPeakElement(nums));

    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithMultiplePeaks(Solution solution) {
        int[] nums = {1, 2, 1, 3, 5, 6, 4};
        int actual = solution.findPeakElement(nums);
        boolean isValidPeak = (actual == 2 || actual == 5); // Since both 2 and 5 are valid peak
                                                            // indices
        assertTrue(isValidPeak, "The returned index must be either 2 or 5.");
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmOnEmptyArray(Solution solution) {
        int[] nums = {};
        int expected = -1; // Assuming your method returns -1 for an empty array
        assertEquals(expected, solution.findPeakElement(nums));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmOnSingleElementArray(Solution solution) {
        int[] nums = {42}; // Single element array
        int expected = 0; // The only element is a peak
        assertEquals(expected, solution.findPeakElement(nums));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmOnPeakAtStart(Solution solution) {
        int[] nums = {3, 2, 1};
        int expected = 0; // Peak is at the start
        assertEquals(expected, solution.findPeakElement(nums));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmOnPeakAtEnd(Solution solution) {
        int[] nums = {1, 2, 3};
        int expected = 2; // Peak is at the end
        assertEquals(expected, solution.findPeakElement(nums));
    }
}
