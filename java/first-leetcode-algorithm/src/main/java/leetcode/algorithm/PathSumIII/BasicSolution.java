package leetcode.algorithm.PathSumIII;

import java.util.HashMap;

public class BasicSolution extends Solution {

    public int pathSum(TreeNode root, long targetSum, HashMap<Long, Integer> currentSumMap,
            long currentSum) {
        int count = 0;

        if (root == null)
            return count;
        currentSum += root.val;

        // check for this node
        count += currentSumMap.getOrDefault(currentSum - targetSum, 0);
        currentSumMap.put(currentSum, currentSumMap.getOrDefault(currentSum, 0) + 1);

        // for the following nodes
        count += pathSum(root.left, targetSum, currentSumMap, currentSum);
        count += pathSum(root.right, targetSum, currentSumMap, currentSum);

        // remove current sum after
        currentSumMap.put(currentSum, currentSumMap.get(currentSum) - 1);
        return count;
    }

    @Override
    public int pathSumIII(TreeNode root, int targetSum) {
        // using a map to records the sum from root to now
        HashMap<Long, Integer> currentSumMap = new HashMap<>();
        currentSumMap.put(0L, 1);
        // dfs trace the tree and check the subsum
        return pathSum(root, targetSum, currentSumMap, 0);
    }

}
