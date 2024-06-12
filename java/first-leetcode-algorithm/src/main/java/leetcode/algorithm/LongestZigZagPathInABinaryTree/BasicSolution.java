package leetcode.algorithm.LongestZigZagPathInABinaryTree;

public class BasicSolution extends Solution {

    private int maxZigZag(TreeNode root, boolean isLeft, int curSteps) {
        if (root == null)
            return curSteps - 1;

        int leftPath = 0;
        int rightPath = 0;
        if (isLeft) {
            leftPath = maxZigZag(root.left, true, 1);
            rightPath = maxZigZag(root.right, false, curSteps + 1);
        } else {
            leftPath = maxZigZag(root.left, true, curSteps + 1);
            rightPath = maxZigZag(root.right, false, 1);
        }
        return Math.max(leftPath, rightPath);
    }

    @Override
    public int longestZigZagPathInABinaryTree(TreeNode root) {

        if (root == null)
            return 0;
        // recursion the node from root
        // for the opposite direction -> add one
        // for the same direction -> renew the step from one
        int leftPath = maxZigZag(root.left, true, 1);
        int rightPath = maxZigZag(root.right, false, 1);
        return Math.max(leftPath, rightPath);
    }

}
