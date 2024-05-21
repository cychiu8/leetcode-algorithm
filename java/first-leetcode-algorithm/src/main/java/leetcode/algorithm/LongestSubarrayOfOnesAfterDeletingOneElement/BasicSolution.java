package leetcode.algorithm.LongestSubarrayOfOnesAfterDeletingOneElement;

public class BasicSolution extends Solution {
    @Override
    public int longestSubarrayOfOnesAfterDeletingOneElement(int[] nums) {
        // use left and right to indicate the changeable window
        // if already remove one then move the window => right++, left++
        // if the position doesn't need to remove => extend the window ==> right++
        // return the window size (right-left-1)

        int left = 0;
        int right = 0;
        int removable = 1;

        while (right < nums.length) {
            if (nums[right] == 0) {
                removable--;
            }
            if (removable < 0) {
                if (nums[left] == 0) {
                    removable++;
                }
                left++;
            }
            right++;
        }

        return right - left - 1;
    }

}
