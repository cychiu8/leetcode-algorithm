package leetcode.algorithm.SearchInBinarySearchTree;

public class BasicSolution extends Solution {
    @Override
    public TreeNode searchInBinarySearchTree(TreeNode root, int val) {

        TreeNode cur = root;
        while (cur != null) {
            if (cur.val == val)
                return cur;
            else if (cur.val > val) {
                cur = cur.left;
            } else {
                cur = cur.right;
            }

        }

        return null;
    }

}
