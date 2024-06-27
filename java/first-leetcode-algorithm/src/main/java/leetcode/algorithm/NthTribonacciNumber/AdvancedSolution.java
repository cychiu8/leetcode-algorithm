package leetcode.algorithm.NthTribonacciNumber;

public class AdvancedSolution extends Solution {

    // time complexity: O(n)
    @Override
    public int nthTribonacciNumber(int n) {
        if (n < 2)
            return n;
        int t0 = 0;
        int t1 = 1;
        int t2 = 1;
        int tn;
        while (n-- > 2) {
            tn = t0 + t1 + t2;
            t0 = t1;
            t1 = t2;
            t2 = tn;
        }
        return t2;
    }

}
