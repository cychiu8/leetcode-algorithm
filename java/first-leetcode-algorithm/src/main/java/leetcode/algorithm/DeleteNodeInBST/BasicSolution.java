package leetcode.algorithm.DeleteNodeInBST;

public class BasicSolution extends Solution {
    @Override
    public TreeNode deleteNodeInBST(TreeNode root, int key) {

        // find the node
        if (root == null) {
            return null;
        }

        if (root.val < key) {
            root.right = deleteNodeInBST(root.right, key);
        } else if (root.val > key) {
            root.left = deleteNodeInBST(root.left, key);
        } else {
            // three situation for deleted node


            if (root.left == null && root.right == null) {
                // 1. leaf -> no child
                root = null;
            } else if (root.left == null) {
                // 2. with one child
                root = root.right;
            } else if (root.right == null) {
                root = root.left;
            } else {
                // 3. with two children -> use right min leaf as root to replace the deleted one

                TreeNode minValueOfRight = minValueInTree(root.right);
                root.val = minValueOfRight.val;
                root.right = deleteNodeInBST(root.right, minValueOfRight.val);
            }

        }
        return root;
    }

    private TreeNode minValueInTree(TreeNode root) {
        TreeNode cur = root;
        while (cur.left != null) {
            cur = cur.left;
        }
        return cur;
    }
}
