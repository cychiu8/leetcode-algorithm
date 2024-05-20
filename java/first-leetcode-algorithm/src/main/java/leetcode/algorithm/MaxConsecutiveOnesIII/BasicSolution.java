package leetcode.algorithm.MaxConsecutiveOnesIII;

public class BasicSolution extends Solution {
    @Override
    public int maxConsecutiveOnesIII(int[] nums, int k) {
        // set the bondary for windows
        int left = 0;
        int right = 0;
        int resK = k;

        while (right < nums.length) {
            if (nums[right] == 0) {
                resK--;
            }
            if (resK < 0) {
                if (nums[left] == 0) {
                    resK++;
                }
                left++;
            }
            right++;
        }

        // return the final window size
        return right - left;
    }

}
