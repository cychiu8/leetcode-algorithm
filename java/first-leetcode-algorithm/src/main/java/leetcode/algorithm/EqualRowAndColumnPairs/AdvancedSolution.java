package leetcode.algorithm.EqualRowAndColumnPairs;

import java.util.Arrays;
import java.util.HashMap;

public class AdvancedSolution extends Solution {
    @Override
    public int equalRowAndColumnPairs(int[][] grid) {
        int count = 0;
        int n = grid.length;
        HashMap<String, Integer> map = new HashMap<>();

        int[][] transport = new int[n][n];

        // transport
        // time complexity: O(n*n)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transport[j][i] = grid[i][j];
            }
        }

        // map
        for (int i = 0; i < n; i++) {
            String str = Arrays.toString(grid[i]);
            map.put(str, map.getOrDefault(str, 0) + 1);
        }

        // check
        for (int i = 0; i < n; i++) {
            String str = Arrays.toString(transport[i]);
            if (map.containsKey(str)) {
                count += map.get(str);
            }
        }

        return count;
    }

}
