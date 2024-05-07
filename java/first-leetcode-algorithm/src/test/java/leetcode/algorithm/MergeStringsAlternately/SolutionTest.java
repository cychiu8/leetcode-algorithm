package leetcode.algorithm.MergeStringsAlternately;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    private Solution solution = new Solution();

    @Test
    public void testMergeAlternately() {
        assertEquals("apbqcr", solution.mergeAlternately("abc", "pqr"));
        assertEquals("apbqrs", solution.mergeAlternately("ab", "pqrs"));
        assertEquals("apbqcd", solution.mergeAlternately("abcd", "pq"));
    }

}