package leetcode.algorithm.NearestExitFromEntranceInMaze;

import java.util.LinkedList;
import java.util.Queue;

public class ImprovedSolution extends Solution {

    @Override
    public int nearestExitFromEntranceInMaze(char[][] maze, int[] entrance) {
        // Queue for the trace
        // -> trace the (i,j) directly, you don't need to memory the distance now when you use bfs
        Queue<int[]> q = new LinkedList<>();
        int rows = maze.length;
        int cols = maze[0].length;

        // instead of creating visited matrix, use maze directly to remark the maze
        q.offer(entrance);
        maze[entrance[0]][entrance[1]] = 'x';

        // use steps to memorize the levels
        int steps = 0;
        int x;
        int y;

        // use direction map to generalize the operation
        int[][] directions = new int[][] {{0, 1}, {0, -1}, {-1, 0}, {1, 0}};

        while (!q.isEmpty()) {

            steps++;
            int n = q.size();

            for (int i = 0; i < n; i++) {
                // these are same steps
                int[] cur = q.poll();

                // for each direction
                for (int[] direction : directions) {
                    x = cur[0] + direction[0];
                    y = cur[1] + direction[1];

                    // invalid
                    if (x < 0 || x >= rows || y < 0 || y >= cols)
                        continue;

                    // not wall
                    if (maze[x][y] != '.')
                        continue;

                    // exit
                    if (x == 0 || x == rows - 1 || y == 0 || y == cols - 1)
                        return steps;

                    // others
                    q.offer(new int[] {x, y});
                    maze[x][y] = 'x';
                }

            }

        }
        return -1;
    }

}
