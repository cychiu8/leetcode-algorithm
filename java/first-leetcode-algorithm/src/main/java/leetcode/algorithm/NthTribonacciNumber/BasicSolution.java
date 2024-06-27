package leetcode.algorithm.NthTribonacciNumber;

public class BasicSolution extends Solution {

    // time complexity: O(3^n)
    @Override
    public int nthTribonacciNumber(int n) {
        if (n == 0)
            return 0;
        if (n == 1)
            return 1;
        if (n == 2)
            return 1;
        return nthTribonacciNumber(n - 1) + nthTribonacciNumber(n - 2) + nthTribonacciNumber(n - 3);
    }

}
