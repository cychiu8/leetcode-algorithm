package leetcode.algorithm.TotalCostToHireKWorkers;

import java.util.PrimitiveIterator;
import java.util.PriorityQueue;

public class BasicSolution extends Solution {
    @Override
    public long totalCostToHireKWorkers(int[] costs, int k, int candidates) {
        // use two heap to store the first and last candidates
        // for each round compare two min for the heap
        PriorityQueue<Integer> heapFirst = new PriorityQueue<>();
        PriorityQueue<Integer> heapLast = new PriorityQueue<>();

        long totalCost = 0;
        int n = costs.length;
        int l = 0;
        int r = n - 1;
        while (k > 0) {
            while (heapFirst.size() < candidates && l <= r) {
                heapFirst.add(costs[l]);
                l++;
            }
            while (heapLast.size() < candidates && l <= r) {
                heapLast.add(costs[r]);
                r--;
            }

            if (heapFirst.isEmpty() && heapLast.isEmpty())
                return totalCost;

            if (!heapFirst.isEmpty() && !heapLast.isEmpty()) {
                if (heapFirst.peek() <= heapLast.peek()) {
                    totalCost += heapFirst.poll();
                } else {
                    totalCost += heapLast.poll();
                }
            } else if (heapFirst.isEmpty()) {
                totalCost += heapLast.poll();
            } else {
                totalCost += heapFirst.poll();
            }

            k--;
        }
        return totalCost;
    }

}
