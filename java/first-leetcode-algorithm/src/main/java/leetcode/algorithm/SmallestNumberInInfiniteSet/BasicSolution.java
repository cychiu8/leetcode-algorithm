package leetcode.algorithm.SmallestNumberInInfiniteSet;

import java.util.PriorityQueue;

public class BasicSolution extends SmallestInfiniteSet {

    private int minNum;
    private PriorityQueue<Integer> heap;

    public BasicSolution() {
        minNum = 1;
        heap = new PriorityQueue<>();
    }

    @Override
    public int popSmallest() {
        if (!heap.isEmpty()) {
            return heap.poll();
        }
        minNum++;
        return minNum - 1;
    }

    @Override
    public void addBack(int num) {
        if (num < minNum && !heap.contains(num)) {
            heap.add(num);
        }
    }

}
