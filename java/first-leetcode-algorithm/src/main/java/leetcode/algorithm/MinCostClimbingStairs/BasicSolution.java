package leetcode.algorithm.MinCostClimbingStairs;

public class BasicSolution extends Solution {

    @Override
    public int minCostClimbingStairs(int[] cost) {

        // time complexity: O(2^n)

        // the hight of the stairs
        // calcuate the cost of each steps
        int n = cost.length;
        int results = Math.min(dp(n - 1, cost), dp(n - 2, cost));
        return results;
    }

    public int dp(int n, int[] cost) {
        if (n < 2)
            return cost[n];

        return Math.min(cost[n] + dp(n - 1, cost), cost[n] + dp(n - 2, cost));
    }

}
