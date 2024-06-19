package leetcode.algorithm.RottingOranges;

import java.util.LinkedList;
import java.util.Queue;

public class BasicSolution extends Solution {


    @Override
    public int rottingOranges(int[][] grid) {
        // traverse all the rotten orange and put them into the initial q
        int rows = grid.length;
        int cols = grid[0].length;

        Queue<int[]> q = new LinkedList<>();

        int fresh = 0;

        for (int i = 0; i < cols; i++) {
            for (int j = 0; j < rows; j++) {
                if (grid[j][i] == 2) {
                    q.offer(new int[] {i, j});
                } else if (grid[j][i] == 1) {
                    fresh++;
                } ;
            }
        }

        if (fresh == 0)
            return 0;

        // from each level reach other orange
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        int steps = -1;
        int x, y;
        while (!q.isEmpty()) {
            steps++;
            int n = q.size();
            for (int i = 0; i < n; i++) {
                int[] cur = q.poll();

                for (int[] direction : directions) {
                    x = cur[0] + direction[0];
                    y = cur[1] + direction[1];

                    // invalid
                    if (x < 0 || x >= cols || y < 0 || y >= rows)
                        continue;

                    // already rotten or empty
                    if (grid[y][x] != 1)
                        continue;

                    // fresh -> become rotten -> and go to the next round to crash others
                    grid[y][x] = 2;
                    fresh--;
                    q.offer(new int[] {x, y});

                }
            }
        }

        // after the empty q
        // check whether still fresh
        if (fresh > 0)
            return -1;

        return steps;
    }

}
