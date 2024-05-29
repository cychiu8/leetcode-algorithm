package leetcode.algorithm.AsteroidCollision;

import java.util.Stack;

public class BasicSolution extends Solution {

    private boolean isCollision(int left, int right) {
        if (left > 0 && right < 0) {
            return true;
        }
        return false;
    }

    @Override
    public int[] asteroidCollision(int[] asteroids) {
        // like stack, interact with the previous one
        Stack<Integer> lane = new Stack<>();

        for (int asteroid : asteroids) {
            lane.add(asteroid);

            // start collisions
            while (!lane.empty() && lane.size() > 1) {
                int current = lane.pop();
                int last = lane.peek();

                if (!isCollision(last, current)) {
                    lane.add(current);
                    break;
                }

                // size compare
                if (Math.abs(last) > Math.abs(current)) {
                    // keep last
                } else if (Math.abs(last) == Math.abs(current)) {
                    // both explode
                    lane.pop();
                } else {
                    // keep current
                    lane.pop();
                    lane.add(current);
                }

            }


        }

        int size = lane.size();
        int[] result = new int[size];
        for (int i = size - 1; i >= 0; i--) {
            result[i] = lane.pop();
        }

        return result;
    }

}
