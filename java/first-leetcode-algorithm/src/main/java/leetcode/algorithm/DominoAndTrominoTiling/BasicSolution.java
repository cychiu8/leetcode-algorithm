package leetcode.algorithm.DominoAndTrominoTiling;

public class BasicSolution extends Solution {

    @Override
    public int dominoAndTrominoTiling(int n) {
        if (n <= 2) {
            return n;
        }

        int mod = 100_000_007;

        long[] fullFill = new long[n + 1];
        long[] partFill = new long[n + 1];

        // initial
        fullFill[0] = 1;
        fullFill[1] = 1;
        fullFill[2] = 2;
        partFill[0] = 0;
        partFill[1] = 0;
        partFill[2] = 1;

        for (int i = 3; i <= n; i++) {
            fullFill[i] = (fullFill[i - 1] + fullFill[i - 2] + 2 * partFill[i - 1]) % mod;
            partFill[i] = (fullFill[i - 2] + partFill[i - 1]) % mod;
        }
        return (int) fullFill[n];
    }

}
