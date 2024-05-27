package leetcode.algorithm.EqualRowAndColumnPairs;

import java.util.Arrays;

public class BasicSolution extends Solution {
    @Override
    public int equalRowAndColumnPairs(int[][] grid) {
        int count = 0;
        int n = grid.length;
        String[] stringRow = new String[n];
        String[] stringCol = new String[n];
        int[][] transport = new int[n][n];

        // transport
        // time complexity: O(n*n)
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                transport[j][i] = grid[i][j];
            }
        }

        // to string
        for (int i = 0; i < n; i++) {
            stringRow[i] = Arrays.toString(grid[i]);
            stringCol[i] = Arrays.toString(transport[i]);
        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (stringRow[i].equals(stringCol[j])) {
                    count++;
                }
            }
        }

        return count;
    }

}
