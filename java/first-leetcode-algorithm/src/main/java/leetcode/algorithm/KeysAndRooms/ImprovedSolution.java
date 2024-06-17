package leetcode.algorithm.KeysAndRooms;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class ImprovedSolution extends Solution {

    @Override
    public boolean keysAndRooms(List<List<Integer>> rooms) {

        // visited map
        int n = rooms.size();
        boolean[] visited = new boolean[n];
        for (int i = 0; i < n; i++) {
            visited[i] = false;
        }

        // visit the graph and update the visit
        Stack<Integer> stack = new Stack<>();
        stack.add(0);
        while (!stack.isEmpty()) {
            int cur = stack.pop();

            if (visited[cur] == true) {
                // already visited
                continue;
            } else {
                visited[cur] = true;
                // consider the connections and add to the stack
                for (int i = 0; i < rooms.get(cur).size(); i++) {
                    stack.add(rooms.get(cur).get(i));
                }
            }
        }

        // check the visited map
        for (int i = 0; i < n; i++) {
            if (visited[i] == false) {
                return false;
            }
        }
        return true;
    }

}
