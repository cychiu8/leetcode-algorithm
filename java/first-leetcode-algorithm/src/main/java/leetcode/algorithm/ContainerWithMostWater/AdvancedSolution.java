package leetcode.algorithm.ContainerWithMostWater;

public class AdvancedSolution extends Solution {
    @Override
    public int containerWithMostWater(int[] heights){
        int maxAmount = Integer.MIN_VALUE;

        // two pointer to trace from both side
        int left = 0;
        int right = heights.length - 1;

        while(left < right) {

            int width = right-left;
            int height = Math.min(heights[left], heights[right]);
            maxAmount = Math.max(maxAmount, width*height);

            if (heights[left] < heights[right]) {
                // directly move to the one larger then current
                while(left < right && heights[left] <= height) {
                    left ++;
                }
            } else {
                while(left < right && heights[right] <= height) {
                    right --;
                }
            }
        }


        return maxAmount;
    }
}
