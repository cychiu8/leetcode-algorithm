package leetcode.algorithm.CanPlaceFlowers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private Solution solution= new Solution();

    @Test
    public void testAlgorithmSituationWithTrue(){
        int[] flowerbed = {1,0,0,0,1};
        int newFlower = 1;
        Boolean expected = true;
        assertEquals(expected, solution.canPlaceFlowers(flowerbed, newFlower));
    }

    @Test
    public void testAlgorithmSituationWithFalse(){
        int[] flowerbed = {1,0,0,0,1};
        int newFlower = 2;
        Boolean expected = false;
        assertEquals(expected, solution.canPlaceFlowers(flowerbed, newFlower));
    }

    @Test
    public void testAlgorithmSituationWithTwoConflicts(){
        int[] flowerbed = {1,0,0,0,0,1};
        int newFlower = 2;
        Boolean expected = false;
        assertEquals(expected, solution.canPlaceFlowers(flowerbed, newFlower));
    }

    @Test
    public void testAlgorithmSituationWithEdgeCase(){
        int[]flowerbed = {0};
        int newFlower = 1;
        Boolean expected = true;
        assertEquals(expected, solution.canPlaceFlowers(flowerbed, newFlower));
    }
}
