package leetcode.algorithm;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testMergeAlternately() {
        Solution solution = new Solution();

        assertEquals("apbqcr", solution.mergeAlternately("abc", "pqr"));
        assertEquals("apbqrs", solution.mergeAlternately("ab", "pqrs"));
        assertEquals("apbqcd", solution.mergeAlternately("abcd", "pq"));
    }
}