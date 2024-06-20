package leetcode.algorithm.CanPlaceFlowers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void testAlgorithmSituationWithTrue() {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int newFlower = 1;
        assertTrue(solution.canPlaceFlowers(flowerbed, newFlower));
    }

    @Test
    public void testAlgorithmSituationWithFalse() {
        int[] flowerbed = {1, 0, 0, 0, 1};
        int newFlower = 2;
        assertFalse(solution.canPlaceFlowers(flowerbed, newFlower));
    }

    @Test
    public void testAlgorithmSituationWithTwoConflicts() {
        int[] flowerbed = {1, 0, 0, 0, 0, 1};
        int newFlower = 2;
        assertFalse(solution.canPlaceFlowers(flowerbed, newFlower));
    }

    @Test
    public void testAlgorithmSituationWithEdgeCase() {
        int[] flowerbed = {0};
        int newFlower = 1;
        assertTrue(solution.canPlaceFlowers(flowerbed, newFlower));
    }
}
