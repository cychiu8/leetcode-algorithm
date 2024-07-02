package leetcode.algorithm.UniquePaths;

public class BasicSolution extends Solution {

    @Override
    public int uniquePaths(int m, int n) {
        long dp[][] = new long[m + 1][n + 1];

        // intial
        for (int i = 0; i <= m; i++) {
            dp[i][1] = 1;
        }
        for (int j = 0; j <= n; j++) {
            dp[1][j] = 1;
        }

        // formual
        for (int i = 2; i <= m; i++) {
            for (int j = 2; j <= n; j++) {
                dp[i][j] = dp[i - 1][j] + dp[i][j - 1];
            }
        }

        return (int) dp[m][n];
    }

}
