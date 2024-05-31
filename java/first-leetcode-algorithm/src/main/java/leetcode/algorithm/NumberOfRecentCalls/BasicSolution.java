package leetcode.algorithm.NumberOfRecentCalls;


import java.util.LinkedList;
import java.util.Queue;

public class BasicSolution extends Solution {

    // time complexity: O(n);
    private Queue<Integer> queue;

    public BasicSolution() {
        this.queue = new LinkedList<>();
    }

    @Override
    public int ping(int t) {

        queue.add(t);
        while (!queue.isEmpty() && t - queue.peek() > 3000) {
            queue.poll();
        }

        return queue.size();
    }

}
