package leetcode.algorithm.EvaluateDivision;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class SolutionTest {

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution());
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm(Solution solution) {
        List<List<String>> equations = new ArrayList<>();
        equations.add(Arrays.asList("a", "b"));
        equations.add(Arrays.asList("b", "c"));
        double[] values = {2.0, 3.0};
        List<List<String>> queries = new ArrayList<>();
        queries.add(Arrays.asList("a", "c"));
        queries.add(Arrays.asList("b", "a"));
        queries.add(Arrays.asList("a", "e"));
        queries.add(Arrays.asList("a", "a"));
        queries.add(Arrays.asList("x", "x"));
        double[] expected = {6.00000, 0.50000, -1.00000, 1.00000, -1.00000};
        assertArrayEquals(expected, solution.evaluateDivision(equations, values, queries));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm2(Solution solution) {
        List<List<String>> equations = Arrays.asList(Arrays.asList("a", "b"),
                Arrays.asList("b", "c"), Arrays.asList("bc", "cd"));
        double[] values = {1.5, 2.5, 5.0};
        List<List<String>> queries = Arrays.asList(Arrays.asList("a", "c"), Arrays.asList("c", "b"),
                Arrays.asList("bc", "cd"), Arrays.asList("cd", "bc"));
        double[] expected = {3.75000, 0.40000, 5.00000, 0.20000};
        assertArrayEquals(expected, solution.evaluateDivision(equations, values, queries));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm3(Solution solution) {
        List<List<String>> equations = Arrays.asList(Arrays.asList("a", "b"));
        double[] values = {0.5};
        List<List<String>> queries = Arrays.asList(Arrays.asList("a", "b"), Arrays.asList("b", "a"),
                Arrays.asList("a", "c"), Arrays.asList("x", "y"));
        double[] expected = {0.50000, 2.00000, -1.00000, -1.00000};
        assertArrayEquals(expected, solution.evaluateDivision(equations, values, queries));
    }
}
