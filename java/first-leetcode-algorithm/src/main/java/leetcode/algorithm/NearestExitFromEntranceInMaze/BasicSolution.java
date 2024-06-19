package leetcode.algorithm.NearestExitFromEntranceInMaze;

import java.util.LinkedList;
import java.util.Queue;

public class BasicSolution extends Solution {

    class Node {
        int distance;
        int i;
        int j;

        Node(int i, int j) {
            this.i = i;
            this.j = j;
            this.distance = -1;
        }

        Node(int i, int j, int distance) {
            this.i = i;
            this.j = j;
            this.distance = distance;
        }
    }

    @Override
    public int nearestExitFromEntranceInMaze(char[][] maze, int[] entrance) {
        // Queue for the trace
        Queue<Node> q = new LinkedList<>();
        Node e = new Node(entrance[0], entrance[1]);
        // visited
        boolean[][] visited = new boolean[maze.length][maze[0].length];

        q.offer(e);
        visited[entrance[0]][entrance[1]] = true;
        while (!q.isEmpty()) {
            Node cur = q.poll();

            System.out.println("Node: (" + cur.i + "," + cur.j + ") d=" + cur.distance);

            if (!(cur.i == entrance[0] && cur.j == entrance[1])) {
                // not entrance
                // exit
                if (cur.i == 0 || cur.j == 0 || cur.i == maze.length - 1
                        || cur.j == maze[0].length - 1) {
                    System.out.println("find exit");
                    return cur.distance;
                }
            }

            // four directions
            if (cur.distance == -1) {
                System.out.println("update first consider distance");
                cur.distance = 0;
            }
            // left
            if (cur.j - 1 >= 0 && maze[cur.i][cur.j - 1] == '.' && !visited[cur.i][cur.j - 1]) {
                System.out.println("left");
                q.offer(new Node(cur.i, cur.j - 1, cur.distance + 1));
                visited[cur.i][cur.j - 1] = true;
            }
            // right
            if (cur.j + 1 < maze[0].length && maze[cur.i][cur.j + 1] == '.'
                    && !visited[cur.i][cur.j + 1]) {
                System.out.println("right");
                q.offer(new Node(cur.i, cur.j + 1, cur.distance + 1));
                visited[cur.i][cur.j + 1] = true;
            }
            // up
            if (cur.i - 1 >= 0 && maze[cur.i - 1][cur.j] == '.' && !visited[cur.i - 1][cur.j]) {
                System.out.println("up");
                q.offer(new Node(cur.i - 1, cur.j, cur.distance + 1));
                visited[cur.i - 1][cur.j] = true;
            }
            // down
            if (cur.i + 1 < maze.length && maze[cur.i + 1][cur.j] == '.'
                    && !visited[cur.i + 1][cur.j]) {
                System.out.println("down");
                q.offer(new Node(cur.i + 1, cur.j, cur.distance + 1));
                visited[cur.i + 1][cur.j] = true;
            }
        }
        return -1;
    }

}
