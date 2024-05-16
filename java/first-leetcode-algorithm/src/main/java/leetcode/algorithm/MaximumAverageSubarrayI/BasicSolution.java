package leetcode.algorithm.MaximumAverageSubarrayI;

public class BasicSolution extends Solution {
    @Override
    public double maximumAverageSubarrayI(int[] nums, int k) {

        // calculate the initial sum for length k

        int curSum = 0;
        for (int i = 0; i < k; i++) {
            curSum += nums[i];
        }

        double maxSum = curSum;

        if (nums.length == k) {
            return maxSum / k;
        }

        // move the window (add next element and remove previous element)
        for (int i = 0; i < nums.length - k; i++) {
            curSum += nums[i + k];
            curSum -= nums[i];

            maxSum = Math.max(maxSum, curSum);
        }

        return maxSum / k;
    }

}
