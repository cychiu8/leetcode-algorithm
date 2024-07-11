package leetcode.algorithm.SearchSuggestionSystem;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.List;
import java.util.stream.Stream;

/*
 * 1268. SearchSuggestionSystem
 */

public class SolutionTest {

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution());
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm(Solution solution) {
        assertEquals(
                List.of(List.of("mobile", "moneypot", "monitor"),
                        List.of("mobile", "moneypot", "monitor"), List.of("mouse", "mousepad"),
                        List.of("mouse", "mousepad"), List.of("mouse", "mousepad")),
                solution.searchSuggestionSystem(
                        new String[] {"mobile", "mouse", "moneypot", "monitor", "mousepad"},
                        "mouse"));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithHavana(Solution solution) {
        assertEquals(
                List.of(List.of("havana"), List.of("havana"), List.of("havana"), List.of("havana"),
                        List.of("havana"), List.of("havana")),
                solution.searchSuggestionSystem(new String[] {"havana"}, "havana"));
    }
}
