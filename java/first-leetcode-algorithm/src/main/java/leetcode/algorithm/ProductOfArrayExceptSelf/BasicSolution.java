package leetcode.algorithm.ProductOfArrayExceptSelf;

public class BasicSolution extends Solution {
    @Override
    public int[] productOfArrayExceptSelf(int[] nums){
        int length = nums.length;
        int[] results = new int[length];

        // prefix product and suffix product
        int[] prefix = new int[length];
        int[] suffix = new int[length];
        for(int i = 0; i < length; i++) {
            if(i == 0) {
                prefix[i] = 1;
                suffix[length-i-1] = 1;
            } else {
                prefix[i] = prefix[i-1] * nums[i-1];
                suffix[length-i-1] = suffix[length-i]*nums[length-i]; 
            }
        }

        // the product of array except self
        for(int i = 0; i < length; i++) {
            results[i] = prefix[i]*suffix[i];
        }
        
        return results;
    }

}
