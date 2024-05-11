package leetcode.algorithm.MoveZeroes;

public class BasicSolution extends Solution {
    @Override
    public void moveZeroes(int[] nums){
        // loop and exchange the elements
        // if current element is zero then swap current element with next none zero
        int currentIdx = 0;
        int noneZeroIdx = 0;

        while(currentIdx < nums.length - 1){
            if(nums[currentIdx] == 0) {
                noneZeroIdx = currentIdx + 1;
                while(noneZeroIdx < nums.length - 1 && nums[noneZeroIdx] == 0) {
                    noneZeroIdx++;
                }
                nums[currentIdx] = nums[noneZeroIdx];
                nums[noneZeroIdx] = 0;
            }
            currentIdx++;
        }
    }

}
