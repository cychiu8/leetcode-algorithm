package leetcode.algorithm.FindPeakElement;

public class BasicSolution extends Solution {

    @Override
    public int findPeakElement(int[] nums) {
        int n = nums.length;
        if (n == 0)
            return -1;
        if (n == 1)
            return 0;

        if (nums[0] > nums[1])
            return 0;
        if (nums[n - 1] > nums[n - 2])
            return n - 1;

        int l = 1;
        int r = n - 2;
        while (l <= r) {
            int mid = l + (r - l) / 2;
            // if mid>mid+1 & mid>mid-1 => find the peak
            if (nums[mid] > nums[mid + 1] && nums[mid] > nums[mid - 1])
                return mid;
            else if (nums[mid] < nums[mid + 1]) {
                // else if mid < mid + 1 => peak at the right side
                l = mid + 1;
            } else if (nums[mid] < nums[mid - 1]) {
                // else if mid < mid - 1 => peak at the left side
                r = mid - 1;
            }
        }
        return -1;
    }

}
