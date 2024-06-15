package leetcode.algorithm.SearchInBinarySearchTree;

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

    private TreeNode createTreeFromArr(Integer[] arr) {
        if (arr.length == 0)
            return null;
        Queue<TreeNode> q = new LinkedList<>();
        TreeNode root = new TreeNode(arr[0]);
        q.offer(root);
        int idx = 1;
        while (!q.isEmpty() && idx < arr.length) {
            TreeNode cur = q.poll();
            if (arr[idx] != null) {
                cur.left = new TreeNode(arr[idx]);
                q.offer(cur.left);
            }
            idx++;
            if (idx < arr.length && arr[idx] != null) {
                cur.right = new TreeNode(arr[idx]);
                q.offer(cur.right);
            }
            idx++;
        }
        return root;
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm(Solution solution) {
        TreeNode root = new TreeNode(4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node7 = new TreeNode(7);
        TreeNode node1 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);

        root.left = node2;
        root.right = node7;

        node2.left = node1;
        node2.right = node3;
        int val = 2;
        assertEquals(node2, solution.searchInBinarySearchTree(root, val));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithNoValue(Solution solution) {
        TreeNode root = new TreeNode(4);
        TreeNode node2 = new TreeNode(2);
        TreeNode node7 = new TreeNode(7);
        TreeNode node1 = new TreeNode(1);
        TreeNode node3 = new TreeNode(3);

        root.left = node2;
        root.right = node7;

        node2.left = node1;
        node2.right = node3;
        int val = 5;
        assertEquals(null, solution.searchInBinarySearchTree(root, val));
    }
}
