package leetcode.algorithm.MaxNumberOfKSumPairs;

import java.util.Arrays;

public class BasicSolution extends Solution {
    @Override
    public int maxNumberOfKSumPairs(int[] nums, int k){
        int count = 0;
        // sort the array
        Arrays.sort(nums);

        // check from two side (left and right)
        int left = 0;
        int right = nums.length - 1;
        while (left < right) {
            if (nums[left] + nums[right] == k) {
                // if same as target -> count ++
                count++;
                left++;
                right--;
            } else if (nums[left] + nums[right] < k) {
                // if less then target -> left ++
                left ++;
            } else {
                // if larget then target -> right --
                right --;
            }
        }
        return count;
    }

}
