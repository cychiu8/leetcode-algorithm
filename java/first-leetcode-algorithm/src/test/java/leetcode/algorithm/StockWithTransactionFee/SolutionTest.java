package leetcode.algorithm.StockWithTransactionFee;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

/*
 * 714. StockWithTransactionFee
 */

public class SolutionTest {

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution());
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm(Solution solution) {
        assertEquals(8, solution.stockWithTransactionFee(new int[] {1, 3, 2, 8, 4, 9}, 2));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithDifferentInput(Solution solution) {
        assertEquals(6, solution.stockWithTransactionFee(new int[] {1, 3, 7, 5, 10, 3}, 3));
    }
}
