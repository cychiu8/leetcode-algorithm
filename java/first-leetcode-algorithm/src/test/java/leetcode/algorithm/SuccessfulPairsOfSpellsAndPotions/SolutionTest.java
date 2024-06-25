package leetcode.algorithm.SuccessfulPairsOfSpellsAndPotions;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.stream.Stream;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

public class SolutionTest {

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution());
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm(Solution solution) {
        int[] spells = {5, 1, 3};
        int[] potions = {1, 2, 3, 4, 5};
        long success = 7L;
        int[] expected = {4, 0, 3};
        assertArrayEquals(expected,
                solution.successfulPairsOfSpellsAndPotions(spells, potions, success));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm2(Solution solution) {
        int[] spells = {3, 1, 2};
        int[] potions = {8, 5, 8};
        long success = 16L;
        int[] expected = {2, 0, 2};
        assertArrayEquals(expected,
                solution.successfulPairsOfSpellsAndPotions(spells, potions, success));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmEdgeCase(Solution solution) {
        // Create a large array of spells with incrementing values
        int[] spells = new int[1000];
        for (int i = 0; i < spells.length; i++) {
            spells[i] = i + 1; // Spells range from 1 to 1000
        }

        // Create a large array of potions with decrementing values
        int[] potions = new int[1000];
        for (int i = 0; i < potions.length; i++) {
            potions[i] = 1000 - i; // Potions range from 1000 to 1
        }

        long success = 2300L; // High success threshold
        // Expected result will depend on the specific logic of your algorithm.
        // For demonstration, let's assume a placeholder expected result.
        // You'll need to replace this with the actual expected result based on your algorithm's
        // logic.
        int[] expected = new int[spells.length]; // Placeholder expected result array

        // Fill in the expected array based on your algorithm's expected behavior
        // This is just a placeholder loop and should be replaced with actual logic
        for (int i = 0; i < expected.length; i++) {
            int count = 0;
            for (int potion : potions) {
                if (spells[i] * potion >= success) {
                    count += 1;
                    expected[i] = count;
                }
            }
        }

        assertArrayEquals(expected,
                solution.successfulPairsOfSpellsAndPotions(spells, potions, success));
    }
}
