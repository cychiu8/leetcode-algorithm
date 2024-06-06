package leetcode.algorithm.CountGoodNodesInBinaryTree;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

public class SolutionTest {

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution());
    }

    public TreeNode insertTreeFromArray(Integer[] arr, int i) {
        if (i >= arr.length)
            return null;
        if (arr[i] == null)
            return null;
        TreeNode newNode = new TreeNode(arr[i]);
        newNode.left = insertTreeFromArray(arr, 2 * i + 1);
        newNode.right = insertTreeFromArray(arr, 2 * i + 2);
        return newNode;
    }

    public TreeNode createTreeFromArray(Integer[] arr) {
        return insertTreeFromArray(arr, 0);
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm(Solution solution) {
        Integer[] arr = {3, 1, 4, 3, null, 1, 5};
        TreeNode root = createTreeFromArray(arr);
        int expected = 4;
        assertEquals(expected, solution.countGoodNodesInBinaryTree(root));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm2(Solution solution) {
        Integer[] arr = {3, 3, null, 4, 2};
        TreeNode root = createTreeFromArray(arr);
        int expected = 3;
        assertEquals(expected, solution.countGoodNodesInBinaryTree(root));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmWithOneElement(Solution solution) {
        Integer[] arr = {1};
        TreeNode root = createTreeFromArray(arr);
        int expected = 1;
        assertEquals(expected, solution.countGoodNodesInBinaryTree(root));
    }
}
