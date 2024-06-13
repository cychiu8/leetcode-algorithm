package leetcode.algorithm.LowestCommonAncetorOfABinaryTree;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.LinkedList;
import java.util.Queue;
import java.util.stream.Stream;

public class SolutionTest {

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution());
    }

    private TreeNode createTreeFromArray(Integer[] arr) {
        if (arr.length == 0)
            return null;

        Queue<TreeNode> queue = new LinkedList<>();
        TreeNode root = new TreeNode(arr[0]);
        queue.add(root);
        int idx = 1;

        while (!queue.isEmpty() && idx < arr.length) {
            TreeNode cur = queue.poll();

            if (arr[idx] != null) {
                cur.left = new TreeNode(arr[idx]);
                queue.add(cur.left);
            }
            idx++;
            if (idx < arr.length && arr[idx] != null) {
                cur.right = new TreeNode(arr[idx]);
                queue.add((cur.right));
            }
            idx++;
        }
        return root;
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm(Solution solution) {
        // Test Case 1: Nodes in different subtrees
        TreeNode root = new TreeNode(3);
        TreeNode p = new TreeNode(5);
        TreeNode q = new TreeNode(1);
        root.left = p;
        root.right = q;
        assertEquals(root, solution.lowestCommonAncetorOfABinaryTree(root, p, q));

        // Test Case 2: One node is the ancestor of the other
        TreeNode node4 = new TreeNode(4);
        TreeNode node6 = new TreeNode(6);
        p.left = node4;
        p.right = node6;
        assertEquals(p, solution.lowestCommonAncetorOfABinaryTree(root, p, node6));

        // Test Case 3: Both nodes are in the left subtree
        TreeNode node7 = new TreeNode(7);
        node4.left = node7;
        assertEquals(node4, solution.lowestCommonAncetorOfABinaryTree(root, node4, node7));

        // Test Case 4: Both nodes are in the right subtree
        TreeNode node8 = new TreeNode(8);
        q.left = node8;
        assertEquals(q, solution.lowestCommonAncetorOfABinaryTree(root, node8, q));
    }
}
