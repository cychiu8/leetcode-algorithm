package leetcode.algorithm.ReverseVowelsOfAString;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private Solution solution= new Solution();

    @Test
    public void testAlgorithmWithTwoVowels(){
        String expected = "holle";
        String input = "hello";
        assertEquals(expected, solution.reverseVowelsOfAString(input));
    }

    @Test
    public void testAlgorithmWithFourVowels(){
        String expected = "leotcede";
        String input = "leetcode";
        assertEquals(expected, solution.reverseVowelsOfAString(input));
    }

    @Test
    public void testAlgorithmWithOneVowel(){
        String expected = "hat";
        String input = "hat";
        assertEquals(expected, solution.reverseVowelsOfAString(input));
    
    }

    @Test
    public void testAlgorithmWithDifferentCase(){
        String expected = "aA";
        String input = "Aa";
        assertEquals(expected, solution.reverseVowelsOfAString(input));
    
    }
}
