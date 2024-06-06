package leetcode.algorithm.MaximumDepthOfBinaryTree;

import java.util.LinkedList;
import java.util.Queue;

public class BFSSolution extends Solution {
    @Override
    public int maximumDepthOfBinaryTree(TreeNode root) {
        // loop queue for each level
        int level = 0;
        Queue<TreeNode> q = new LinkedList<>();

        q.add(root);
        while (!q.isEmpty()) {
            int sizeOfLevel = q.size();
            level++;
            for (int i = 0; i < sizeOfLevel; i++) {
                TreeNode cur = q.poll();
                if (cur == null)
                    continue;
                q.add(cur.left);
                q.add(cur.left);
            }
        }
        return level;

    }
}
