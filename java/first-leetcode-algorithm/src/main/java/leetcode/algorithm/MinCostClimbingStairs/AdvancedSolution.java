package leetcode.algorithm.MinCostClimbingStairs;

public class AdvancedSolution extends Solution {

    @Override
    public int minCostClimbingStairs(int[] cost) {

        // time complexity: O(n)
        // space complexity: O(1)

        int n = cost.length;

        if (n <= 2)
            return Math.min(cost[0], cost[1]);

        int first = cost[0];
        int second = cost[1];
        int cur;
        for (int i = 2; i < n; i++) {
            cur = cost[i] + Math.min(first, second);
            first = second;
            second = cur;
        }
        return Math.min(first, second);
    }

}
