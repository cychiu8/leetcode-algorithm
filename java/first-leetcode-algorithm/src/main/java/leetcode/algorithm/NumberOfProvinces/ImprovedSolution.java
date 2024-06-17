package leetcode.algorithm.NumberOfProvinces;

public class ImprovedSolution extends Solution {
    // instead of using stack, using dfs traverse recursive function
    // time complexity: O(n*n) -> visit all nodes and edges
    // space complexity: O(n), visited map for all nodes
    @Override
    public int numberOfProvinces(int[][] isConnected) {
        int count = 0;
        int n = isConnected.length;
        boolean[] visted = new boolean[n];

        for (int i = 0; i < n; i++) {
            if (visted[i] == false) {
                count++;
                dfs(isConnected, i, visted);
            }

        }
        return count;
    }

    void dfs(int[][] isConnected, int cur, boolean[] visted) {
        for (int j = 0; j < isConnected.length; j++) {
            if (cur != j && isConnected[cur][j] == 1 && visted[j] == false) {
                visted[j] = true;
                dfs(isConnected, j, visted);
            }
        }
    }

}
