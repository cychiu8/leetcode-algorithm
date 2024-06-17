package leetcode.algorithm.KeysAndRooms;

import java.util.HashMap;
import java.util.List;
import java.util.Stack;

public class BasicSolution extends Solution {

    @Override
    public boolean keysAndRooms(List<List<Integer>> rooms) {

        // time complexity: O(n+m)
        // n: nodes
        // m: edges
        // space complexity: O(n)

        // visited map
        int n = rooms.size();
        HashMap<Integer, Integer> visited = new HashMap<>();
        for (int i = 0; i < n; i++) {
            visited.put(i, 0);
        }

        // visit the graph and update the visit
        Stack<Integer> stack = new Stack<>();
        stack.add(0);
        while (!stack.isEmpty()) {
            int cur = stack.pop();

            if (visited.get(cur) >= 1) {
                // already visited
                continue;
            } else {
                visited.put(cur, visited.get(cur) + 1);
                // consider the connections and add to the stack
                for (int i = 0; i < rooms.get(cur).size(); i++) {
                    stack.add(rooms.get(cur).get(i));
                }
            }
        }

        // check the visited map
        for (int i = 0; i < n; i++) {
            if (visited.get(i) == 0) {
                return false;
            }
        }

        return true;
    }

}
