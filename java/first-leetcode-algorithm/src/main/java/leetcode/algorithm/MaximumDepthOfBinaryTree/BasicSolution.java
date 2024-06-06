package leetcode.algorithm.MaximumDepthOfBinaryTree;

public class BasicSolution extends Solution {
    @Override
    public int maximumDepthOfBinaryTree(TreeNode root) {
        // Recursive -> DFS
        if (root == null)
            return 0;
        int leftDepth = maximumDepthOfBinaryTree(root.left);
        int rightDepth = maximumDepthOfBinaryTree(root.right);

        return Math.max(leftDepth, rightDepth) + 1;
    }

}
