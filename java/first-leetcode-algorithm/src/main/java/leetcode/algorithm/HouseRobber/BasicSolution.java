package leetcode.algorithm.HouseRobber;

public class BasicSolution extends Solution {

    @Override
    public int houseRobber(int[] num) {
        int n = num.length;
        if (n == 0)
            return 0;
        int prev1 = 0;
        int prev2 = 0;
        int cur;
        for (int i = 0; i < n; i++) {
            cur = Math.max(num[i] + prev2, prev1);
            prev2 = prev1;
            prev1 = cur;
        }
        return prev1;
    }

}
