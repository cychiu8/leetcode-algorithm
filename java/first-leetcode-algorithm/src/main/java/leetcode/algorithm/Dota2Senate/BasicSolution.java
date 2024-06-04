package leetcode.algorithm.Dota2Senate;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class BasicSolution extends Solution {

    @Override
    public String dota2Senate(String senate) {
        // two queue to keep active senate
        Queue<Integer> radQueue = new LinkedList<>();
        Queue<Integer> dirQueue = new LinkedList<>();
        for (int i = 0; i < senate.length(); i++) {
            if (senate.charAt(i) == 'R') {
                radQueue.offer(i);
            } else if (senate.charAt(i) == 'D') {
                dirQueue.offer(i);
            }
        }

        int round = senate.length();
        while (!radQueue.isEmpty() && !dirQueue.isEmpty()) {
            int curR = radQueue.poll();
            int curD = dirQueue.poll();

            if (curR < curD) {
                // R win
                radQueue.add(round);

            } else {
                // D win
                dirQueue.add(round);

            }

            round++;
        }

        if (dirQueue.isEmpty())
            return "Radiant";

        return "Dire";

    }

}
