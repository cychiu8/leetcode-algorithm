package leetcode.algorithm.KthLargestElementInArray;

import java.util.PriorityQueue;

public class BasicSolution extends Solution {

    @Override
    public int kthLargestElementInArray(int[] nums, int k) {
        // heap sort for the k times
        PriorityQueue<Integer> heap = new PriorityQueue<>((a, b) -> b - a);
        for (int i = 0; i < nums.length; i++) {
            heap.offer(nums[i]);
        }
        for (int i = 0; i < k - 1; i++) {
            heap.poll();
        }
        return heap.poll();
    }

}
