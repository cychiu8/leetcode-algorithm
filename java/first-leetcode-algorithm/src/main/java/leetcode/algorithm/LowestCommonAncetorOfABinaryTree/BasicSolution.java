package leetcode.algorithm.LowestCommonAncetorOfABinaryTree;

public class BasicSolution extends Solution {

    @Override
    public TreeNode lowestCommonAncetorOfABinaryTree(TreeNode root, TreeNode p, TreeNode q) {

        // if current node is null -> return null
        if (root == null)
            return null;
        // if current node is target node -> return it self
        if (root == p || root == q)
            return root;

        // result of left subtree & right subtree
        TreeNode left = lowestCommonAncetorOfABinaryTree(root.left, p, q);
        TreeNode right = lowestCommonAncetorOfABinaryTree(root.right, p, q);

        // stoping criteria:
        // if both left subtree and right subtree are not null
        // -> both find the node -> current node is the LCA
        if (left != null && right != null)
            return root;

        // if only left side not null -> return left side it self
        if (left != null)
            return left;
        return right;
    }

}
