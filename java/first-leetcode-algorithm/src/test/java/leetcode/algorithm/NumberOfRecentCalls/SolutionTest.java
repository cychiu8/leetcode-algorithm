package leetcode.algorithm.NumberOfRecentCalls;

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
    public void testAlgorithm(Solution solution) {

        assertEquals(1, solution.ping(1));
        assertEquals(2, solution.ping(100));
        assertEquals(3, solution.ping(3001));
        assertEquals(3, solution.ping(3002));
    }
}
