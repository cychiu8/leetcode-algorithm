package leetcode.algorithm.MaxLevelSumOfABinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BasicSolution extends Solution {
    @Override
    public int maxLevelSumOfABinaryTree(TreeNode root) {
        int maxSum = Integer.MIN_VALUE;
        int levelOfMaxSum = 1;
        int curLevel = 1;

        // for level considerration -> BFS
        if (root == null)
            return levelOfMaxSum;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        while (!q.isEmpty()) {
            int sizeOfLevel = q.size();
            int sum = 0;
            for (int i = sizeOfLevel; i > 0; i--) {
                TreeNode cur = q.poll();
                if (cur != null) {
                    sum += cur.val;
                    if (cur.left != null)
                        q.offer(cur.left);
                    if (cur.right != null)
                        q.offer(cur.right);
                }
            }
            if (sum > maxSum) {
                maxSum = sum;
                levelOfMaxSum = curLevel;
            }
            curLevel++;
        }

        return levelOfMaxSum;
    }

}
