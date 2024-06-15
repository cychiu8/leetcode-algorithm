package leetcode.algorithm.DeleteNodeInBST;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

public class SolutionTest {

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution());
    }


    @ParameterizedTest
    @MethodSource("solutions")
    public void testDeleteNode(Solution solution) {
        // Create the tree: [5, 3, 6, 2, 4, null, 7]
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);

        solution.deleteNodeInBST(root, 3);

        // check the state of the tree
        assertEquals(5, root.val);
        assertEquals(4, root.left.val);
        assertEquals(6, root.right.val);
        assertEquals(2, root.left.left.val);
        assertEquals(null, root.left.right);
        assertEquals(7, root.right.right.val);
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testDeleteNodeNotInTree(Solution solution) {
        // Create the tree: [5, 3, 6, 2, 4, null, 7]
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(7);

        solution.deleteNodeInBST(root, 0);
        // Check the state of the tree. It should be unchanged.

        assertEquals(5, root.val);
        assertEquals(3, root.left.val);
        assertEquals(6, root.right.val);
        assertEquals(2, root.left.left.val);
        assertEquals(4, root.left.right.val);
        assertEquals(7, root.right.right.val);
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testDeleteNodeOnNullTree(Solution solution) {
        // Create the tree: [5, 3, 6, 2, 4, null, 7]
        TreeNode root = null;

        solution.deleteNodeInBST(root, 0);
        assertEquals(null, root);
    }
}
