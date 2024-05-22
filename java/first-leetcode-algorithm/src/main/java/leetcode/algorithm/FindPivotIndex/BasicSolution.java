package leetcode.algorithm.FindPivotIndex;

public class BasicSolution extends Solution {
    @Override
    public int findPivotIndex(int[] nums) {
        int result = -1;
        // keep left sum and right sum
        // move from the left to right
        // left sum ++ and right sum --
        // compare these two
        // time complexity: O(n)

        int leftSum = 0;
        int rightSum = 0;

        for (int i = 0; i < nums.length; i++) {
            rightSum += nums[i];
        }

        for (int i = 0; i < nums.length; i++) {
            rightSum -= nums[i];
            if (leftSum == rightSum) {
                return i;
            }
            leftSum += nums[i];
        }

        return result;
    }

}
