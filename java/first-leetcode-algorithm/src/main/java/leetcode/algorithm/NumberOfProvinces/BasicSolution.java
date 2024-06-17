package leetcode.algorithm.NumberOfProvinces;

import java.util.Stack;

public class BasicSolution extends Solution {
    @Override
    public int numberOfProvinces(int[][] isConnected) {
        int count = 0;
        int n = isConnected.length;
        boolean[] visted = new boolean[n];

        Stack<Integer> stack = new Stack<>();


        for (int i = 0; i < n; i++) {
            if (visted[i] == true) {
                continue;
            }
            stack.add(i);
            count++;
            while (!stack.isEmpty()) {
                int cur = stack.pop();
                for (int j = 0; j < n; j++) {
                    if (cur != j && isConnected[cur][j] == 1 && visted[j] == false) {
                        visted[j] = true;
                        stack.add(j);
                    }
                }
            }
        }
        return count;
    }

}
