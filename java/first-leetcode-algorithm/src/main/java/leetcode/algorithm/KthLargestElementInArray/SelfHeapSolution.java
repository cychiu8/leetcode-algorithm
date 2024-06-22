package leetcode.algorithm.KthLargestElementInArray;

public class SelfHeapSolution extends Solution {

    @Override
    public int kthLargestElementInArray(int[] nums, int k) {
        // create heap by own self; -> without using priority q
        // start compare the arrar from half: n/2-1 to 0
        // if parent less than children -> swap and sink
        int n = nums.length;
        for (int i = n / 2 - 1; i >= 0; i--) {
            sink(nums, n, i);
        }

        // after create the heap
        // swap the largest and last and sink the last to correct position -> repeat it for k times
        // -> get the answer

        for (int i = n - 1; i > n - 1 - k; i--) {
            int tmp = nums[0];
            nums[0] = nums[i];
            nums[i] = tmp;

            sink(nums, i, 0);
        }

        return nums[n - k];
    }

    private void sink(int[] nums, int n, int i) {
        int l = 2 * i + 1;
        int r = 2 * i + 2;
        int largestIdx = i;
        if (l < n && nums[l] > nums[largestIdx]) {
            largestIdx = l;
        }
        if (r < n && nums[r] > nums[largestIdx]) {
            largestIdx = r;
        }

        if (largestIdx != i) {
            int tmp = nums[i];
            nums[i] = nums[largestIdx];
            nums[largestIdx] = tmp;

            sink(nums, n, largestIdx);
        }
    }

}
