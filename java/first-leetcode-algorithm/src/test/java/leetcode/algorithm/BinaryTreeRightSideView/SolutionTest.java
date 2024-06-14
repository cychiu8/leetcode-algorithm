package leetcode.algorithm.BinaryTreeRightSideView;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.stream.Stream;

public class SolutionTest {

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution());
    }

    private TreeNode createTreeByArray(Integer[] arr) {
        if (arr.length == 0)
            return null;
        TreeNode root = new TreeNode(arr[0]);
        int idx = 1;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
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
    public void testAlgorithmWithTwoLevel(Solution solution) {
        Integer[] arr = {1, 2, 3, null, 5, null, 4};
        TreeNode root = createTreeByArray(arr);
        List<Integer> expected = Arrays.asList(1, 3, 4);
        assertEquals(expected, solution.binaryTreeRightSideView(root));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithOneLevel(Solution solution) {
        Integer[] arr = {1, null, 3};
        TreeNode root = createTreeByArray(arr);
        List<Integer> expected = Arrays.asList(1, 3);
        assertEquals(expected, solution.binaryTreeRightSideView(root));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithEmpty(Solution solution) {
        Integer[] arr = {};
        TreeNode root = createTreeByArray(arr);
        List<Integer> expected = Arrays.asList();
        assertEquals(expected, solution.binaryTreeRightSideView(root));
    }
}
