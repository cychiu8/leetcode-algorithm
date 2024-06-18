package leetcode.algorithm.ReorderRoutes;

import java.util.ArrayList;
import java.util.List;

public class BasicSolution extends Solution {

    public int dfs(List<List<Integer>> graph, boolean[] visited, int node) {
        // count the changes for the direction
        int count = 0;
        visited[node] = true;

        // traverse the neighbors
        for (int tail : graph.get(node)) {
            if (visited[Math.abs(tail)])
                continue;
            if (tail > 0)
                count++;
            count += dfs(graph, visited, Math.abs(tail));
        }

        return count;
    }

    @Override
    public int reorderRoutes(int n, int[][] connections) {

        // transfer the connection to node linked map
        List<List<Integer>> graph = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            graph.add(new ArrayList<>());
        }
        for (int[] pairs : connections) {
            int head = pairs[0];
            int tail = pairs[1];
            graph.get(head).add(tail);
            graph.get(tail).add(head * -1);
        }

        return dfs(graph, new boolean[n], 0);
    }

}
