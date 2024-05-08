package leetcode.algorithm.ProductOfArrayExceptSelf;

public class AdvancedSolution extends Solution {
    @Override
    public int[] productOfArrayExceptSelf(int[] nums){
        // Follow up: Can you solve the problem in O(1) extra space complexity?
        // (The output array does not count as extra space for space complexity analysis.)
        // --> calculate without prefix and suffix array

        // prifix product
        int length = nums.length;
        int[] result = new int[length];
        result[0] = 1;
        for(int i = 1; i < length; i++) {
            result[i] = result[i-1] * nums[i-1];
        }

        // prifix product times right products
        // calculate right products on when looping
        int rightProduct = 1;
        for(int i = length - 1;i > -1; i--) {
            result[i] *= rightProduct;
            rightProduct *= nums[i];
        }
        return result;
    }
}
