package leetcode.algorithm.LeafSimilarTrees;

import java.util.ArrayList;
import java.util.List;

public class AdvancedSolution extends Solution {

    public void leafValSeq(TreeNode node, List<Integer> leaves) {
        if (node == null)
            return;
        if (node.left == null & node.right == null) {
            leaves.add(node.val);
        }
        leafValSeq(node.left, leaves);
        leafValSeq(node.right, leaves);
    }

    @Override
    public boolean leafSimilarTrees(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();

        leafValSeq(root1, leaves1);
        leafValSeq(root2, leaves2);

        return leaves1.equals(leaves2);
    }
}
