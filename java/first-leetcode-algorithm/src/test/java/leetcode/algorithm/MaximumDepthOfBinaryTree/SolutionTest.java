package leetcode.algorithm.MaximumDepthOfBinaryTree;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.io.PrintStream;
import java.util.stream.Stream;

public class SolutionTest {

    private TreeNode insertLevelOrder(Integer[] arr, TreeNode root, int i) {

        if (i >= arr.length)
            return null;

        if (arr[i] == null)
            return null;

        TreeNode newNode = new TreeNode(arr[i]);
        root = newNode;
        newNode.left = insertLevelOrder(arr, root, 2 * i + 1);
        newNode.right = insertLevelOrder(arr, root, 2 * i + 2);

        return root;
    }

    private TreeNode createBinaryTree(Integer[] arr) {
        TreeNode root = insertLevelOrder(arr, null, 0);
        return root;
    }

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution(), new BFSSolution());
    }

    /// print tree
    public void traversePreOrder(StringBuilder sb, String padding, String pointer, TreeNode node) {
        if (node != null) {
            sb.append(padding);
            sb.append(pointer);
            sb.append(node.val);
            sb.append("\n");

            StringBuilder paddingBuilder = new StringBuilder(padding);
            paddingBuilder.append("│  ");

            String paddingForBoth = paddingBuilder.toString();
            String pointerForRight = "└──";
            String pointerForLeft = (node.right != null) ? "├──" : "└──";

            traversePreOrder(sb, paddingForBoth, pointerForLeft, node.left);
            traversePreOrder(sb, paddingForBoth, pointerForRight, node.right);
        }
    }

    public void print(PrintStream os, TreeNode root) {
        StringBuilder sb = new StringBuilder();

        if (root == null) {
            System.out.print("null");
        }

        traversePreOrder(sb, "", "", root);
        os.print(sb.toString());
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm(Solution solution) {
        Integer[] input = {3, 9, 20, null, null, 15, 7};
        TreeNode root = createBinaryTree(input);

        print(System.out, root);

        int expected = 3;
        assertEquals(expected, solution.maximumDepthOfBinaryTree(root));

    }


    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm2(Solution solution) {
        Integer[] input = {1, null, 2};
        TreeNode root = createBinaryTree(input);
        int expected = 2;
        assertEquals(expected, solution.maximumDepthOfBinaryTree(root));

    }
}
