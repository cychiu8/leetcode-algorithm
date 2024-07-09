package leetcode.algorithm.CountingBits;

public class AdvancedSolution extends Solution {

    @Override
    public int[] countingBits(int n) {
        int[] ans = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            // ans[i] will have the same bits as ans[i/2]
            // => i>>1 is the effective way to calculate i/2
            // if i is an odd number then need to add 1
            ans[i] = ans[i >> 1] + (i & 1);
        }
        return ans;
    }

}
