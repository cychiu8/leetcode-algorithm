package leetcode.algorithm.KidsWithTheGreatestNumberOfCandies;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import java.util.Arrays;
import java.util.List;

public class SolutionTest {
    private Solution solution= new Solution();

    @Test
    public void testAlgorithmsWithMultipleGreatest(){
        List<Boolean> expected = Arrays.asList(true, true, true, false, true);
        assertArrayEquals(
            expected.toArray(), 
            solution.kidsWithTheGreatestNumberOfCandies(new int[]{2,3,5,1,3}, 3).toArray());
    }

    @Test
    public void testAlgorithmsWithOneGreatest(){
        List<Boolean> expected = Arrays.asList(true, false, false, false, false);
        assertArrayEquals(expected.toArray(), solution.kidsWithTheGreatestNumberOfCandies(new int[]{4,2,1,1,2},1).toArray());
    }

}
