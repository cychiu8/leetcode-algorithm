package leetcode.algorithm.CountGoodNodesInBinaryTree;

public class BasicSolution extends Solution {

    public int countGood(TreeNode node, int currentMax) {
        int amount = 0;
        if (node == null)
            return amount;
        if (node.val >= currentMax) {
            amount++;
            currentMax = node.val;
        }
        amount += countGood(node.left, currentMax);
        amount += countGood(node.right, currentMax);
        return amount;
    }

    @Override
    public int countGoodNodesInBinaryTree(TreeNode root) {
        int count = 0;

        if (root == null)
            return count;
        count++;

        count += countGood(root.left, root.val);
        count += countGood(root.right, root.val);
        return count;
    }

}
