package leetcode.algorithm.MaxLevelSumOfABinaryTree;

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
        int idx = 1;
        queue.offer(root);

        while (!queue.isEmpty() && idx < arr.length) {
            TreeNode cur = queue.poll();
            if (arr[idx] != null) {
                cur.left = new TreeNode(arr[idx]);
                queue.add(cur.left);
            }
            idx++;
            if (idx < arr.length && arr[idx] != null) {
                cur.right = new TreeNode(arr[idx]);
                queue.add(cur.right);
            }
            idx++;
        }
        return root;
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm(Solution solution) {
        Integer[] arr = {1, 7, 0, 7, -8, null, null};
        TreeNode root = createTreeFromArray(arr);
        int expected = 2;
        assertEquals(expected, solution.maxLevelSumOfABinaryTree(root));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithLargeNumber(Solution solution) {
        Integer[] arr = {989, null, 10250, 98693, -89388, null, null, null, -32127};
        TreeNode root = createTreeFromArray(arr);
        int expected = 2;
        assertEquals(expected, solution.maxLevelSumOfABinaryTree(root));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithNagetiveSum(Solution solution) {
        Integer[] arr = {-100, -200, -300, -20, -5, -10, null};
        TreeNode root = createTreeFromArray(arr);
        int expected = 3;
        assertEquals(expected, solution.maxLevelSumOfABinaryTree(root));
    }
}
