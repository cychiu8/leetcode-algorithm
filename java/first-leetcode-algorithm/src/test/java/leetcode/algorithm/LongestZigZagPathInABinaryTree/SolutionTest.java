package leetcode.algorithm.LongestZigZagPathInABinaryTree;

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

        TreeNode root = new TreeNode(arr[0]);
        Queue<TreeNode> queque = new LinkedList<>();
        int idx = 1;

        queque.add(root);
        while (!queque.isEmpty() && idx < arr.length) {
            TreeNode cur = queque.poll();

            if (arr[idx] != null) {
                cur.left = new TreeNode(arr[idx]);
                queque.add(cur.left);
            }
            idx++;

            if (idx < arr.length && arr[idx] != null) {
                cur.right = new TreeNode(arr[idx]);
                queque.add(cur.right);
            }
            idx++;
        }
        return root;
    }


    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm(Solution solution) {
        Integer[] arr = {1, null, 1, 1, 1, null, null, 1, 1, null, 1, null, null, null, 1};
        TreeNode root = createTreeFromArray(arr);
        int expected = 3;
        assertEquals(expected, solution.longestZigZagPathInABinaryTree(root));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm2(Solution solution) {
        Integer[] arr = {1, 1, 1, null, 1, null, null, 1, 1, null, 1};
        TreeNode root = createTreeFromArray(arr);
        int expected = 4;
        assertEquals(expected, solution.longestZigZagPathInABinaryTree(root));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm3(Solution solution) {
        Integer[] arr = {1};
        TreeNode root = createTreeFromArray(arr);
        int expected = 0;
        assertEquals(expected, solution.longestZigZagPathInABinaryTree(root));
    }
}
