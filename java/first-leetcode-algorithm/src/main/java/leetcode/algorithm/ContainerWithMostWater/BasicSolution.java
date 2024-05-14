package leetcode.algorithm.ContainerWithMostWater;

public class BasicSolution extends Solution {
    @Override
    public int containerWithMostWater(int[] heights){
        
        // two pointer to trace from both side
        int left = 0;
        int right = heights.length - 1;
        
        int maxAmount = Integer.MIN_VALUE;

        // move the lowest side
        while (left < right) {
            int currentAmount = calculateVolume(left, right, heights[left], heights[right]);
            if(currentAmount > maxAmount) {
                maxAmount = currentAmount;
            }
            if(heights[left] < heights[right]) {
                left ++;
            } else {
                right --;
            }
        }
        return maxAmount;
    }

    private int calculateVolume(int left_x,int right_x, int left_y, int right_y) {
        int width = right_x - left_x;
        int height = Math.min(left_y, right_y);
        return width * height;
    }

}
