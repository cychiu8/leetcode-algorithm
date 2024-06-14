package leetcode.algorithm.BinaryTreeRightSideView;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class BasicSolution extends Solution {
    @Override
    public List<Integer> binaryTreeRightSideView(TreeNode root) {
        List<Integer> result = new ArrayList<>();
        // BFS problem for each level consider the last node of that level
        Queue<TreeNode> queue = new LinkedList<>();

        if (root == null)
            return result;

        queue.add(root);

        while (!queue.isEmpty()) {
            // loop each level
            int sizeOfLevel = queue.size();
            for (int i = sizeOfLevel; i > 0; i--) {
                TreeNode cur = queue.poll();
                if (cur != null) {
                    if (cur.left != null)
                        queue.add(cur.left);
                    if (cur.right != null)
                        queue.add(cur.right);
                }
                if (i == 1)
                    result.add(cur.val);
            }
        }

        return result;
    }

}
