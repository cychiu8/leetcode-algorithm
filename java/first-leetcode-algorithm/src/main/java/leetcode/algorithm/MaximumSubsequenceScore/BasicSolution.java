package leetcode.algorithm.MaximumSubsequenceScore;

import java.util.Arrays;
import java.util.PriorityQueue;

public class BasicSolution extends Solution {

    @Override
    public long maximumSubsequenceScore(int[] nums1, int[] nums2, int k) {

        // Max( sum(nums1) + min(nums2 sub) )
        // -> max sum(nums1)
        // -> max the sub nums2 set

        // sort pairs by nums2 (idx is not important)
        int n = nums1.length;
        int[][] pairs = new int[n][2];
        for (int i = 0; i < n; i++) {
            pairs[i][0] = nums1[i];
            pairs[i][1] = nums2[i];
        }

        Arrays.sort(pairs, (a, b) -> (b[1] - a[1]));

        // use k-heap to store nums1 -> each time pop out the min one
        PriorityQueue<Integer> heap = new PriorityQueue<>();
        // sum of nums1
        long sumNums1 = 0;
        // result
        long result = Integer.MIN_VALUE;

        for (int i = 0; i < k; i++) {
            int n1 = pairs[i][0];
            sumNums1 += n1;
            heap.offer(n1);
        }
        result = sumNums1 * pairs[k - 1][1];

        // loop from max nums2
        for (int i = k; i < n; i++) {
            int n1 = pairs[i][0];
            int n2 = pairs[i][1];

            sumNums1 += n1;
            // when the heap is already k -> if we want to consider new element, we need to pop out
            if (heap.size() == k) {
                sumNums1 -= heap.poll();
                result = Math.max(result, sumNums1 * n2);
            }
            heap.offer(n1);

        }

        return result;

    }

}
