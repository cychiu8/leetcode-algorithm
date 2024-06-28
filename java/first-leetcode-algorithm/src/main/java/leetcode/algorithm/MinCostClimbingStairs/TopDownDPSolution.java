package leetcode.algorithm.MinCostClimbingStairs;

public class TopDownDPSolution extends Solution {

    @Override
    public int minCostClimbingStairs(int[] cost) {

        // time complexity: O(n)

        // the hight of the stairs
        // calcuate the cost of each steps
        // introduce memorization to recursion
        int n = cost.length;
        int tmp[] = new int[n];
        int results = Math.min(dp(n - 1, cost, tmp), dp(n - 2, cost, tmp));
        return results;
    }

    public int dp(int n, int[] cost, int[] tmp) {
        if (n < 2)
            return cost[n];

        if (tmp[n] != 0)
            return tmp[n];

        tmp[n] = Math.min(cost[n] + dp(n - 1, cost, tmp), cost[n] + dp(n - 2, cost, tmp));
        return tmp[n];
    }

}
