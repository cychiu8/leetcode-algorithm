package leetcode.algorithm.GreatestCommonDivisorOfString;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private Solution solution= new Solution();

    @Test
    public void testGcdOfStringInputIsGcd(){
        assertEquals("ABC", solution.gcdOfString("ABCABC","ABC"));       
    }

    @Test
    public void testGcdOfString(){
        assertEquals("AB", solution.gcdOfString("ABABAB", "ABAB"));
    }

    @Test
    public void testGcdOfStringNoResult(){
        assertEquals("", solution.gcdOfString("LEET", "CODE"));
    }
}
