package leetcode.algorithm.EditDistance;

public class AdvancedSolution extends Solution {

    @Override
    public int editDistance(String word1, String word2) {
        int m = word1.length();
        int n = word2.length();

        int[][] dp = new int[m + 1][n + 1];

        // initial base
        for (int i = 0; i <= m; i++) {
            // if word2 is empty, then word1 has to do the i times when it is in index i;
            dp[i][0] = i;
        }
        for (int j = 0; j <= n; j++) {
            dp[0][j] = j;
        }

        // the action for each one
        for (int i = 1; i <= m; i++) {
            for (int j = 1; j <= n; j++) {
                // if index(i,j) is the same -> there is no action from (i-1, j-1) to this status.
                if (word1.charAt(i - 1) == word2.charAt(j - 1)) {
                    dp[i][j] = dp[i - 1][j - 1];
                } else {
                    // insert -> next step: word1, word2.substring(1)
                    int insert = 1 + dp[i - 1][j];
                    // delete -> next step: word1.substring(1), word2
                    int delete = 1 + dp[i][j - 1];
                    // replace -> next step: word1.substring(1), word2.substring(1)
                    int replace = 1 + dp[i - 1][j - 1];
                    dp[i][j] = Math.min(Math.min(insert, delete), replace);
                }
            }
        }
        return dp[m][n];
    }

}
