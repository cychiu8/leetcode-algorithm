package leetcode.algorithm.IncreasingTripletSubsequence;

public class AdvancedSolution extends Solution {
    @Override
    public boolean increasingTripletSubsequence(int[] nums){
        // to keep the smallest two
        // time complexity: O(n)
        // space complexity: O(1)
        int[] smallest = new int[2];
        smallest[0] = nums[0];
        smallest[1] = Integer.MAX_VALUE;
        for(int i = 1; i < nums.length; i++) {
            if(nums[i] < smallest[0]) {
                smallest[0] = nums[i];
            } else if(nums[i] > smallest[0] && nums[i] < smallest[1]) {
                smallest[1] = nums[i];
            } else if(nums[i] > smallest[1]) {
                return true;
            }
        }
        return false;
    }
}
