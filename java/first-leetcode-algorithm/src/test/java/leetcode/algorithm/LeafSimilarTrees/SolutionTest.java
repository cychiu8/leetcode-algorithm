package leetcode.algorithm.LeafSimilarTrees;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

public class SolutionTest {

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution(), new AdvancedSolution());
    }

    public TreeNode insertTreeNodeFromArray(Integer[] arr, int i) {
        if (i >= arr.length)
            return null;
        if (arr[i] == null)
            return null;

        TreeNode newNode = new TreeNode(arr[i]);
        newNode.left = insertTreeNodeFromArray(arr, 2 * i + 1);
        newNode.right = insertTreeNodeFromArray(arr, 2 * i + 2);

        return newNode;
    }

    public TreeNode createTreeFromArray(Integer[] arr) {
        return insertTreeNodeFromArray(arr, 0);
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm(Solution solution) {
        Integer[] arr1 = {3, 5, 1, 6, 2, 9, 8, null, null, 7, 4};
        Integer[] arr2 = {3, 5, 1, 6, 7, 4, 2, null, null, null, null, null, null, 9, 8};

        TreeNode root1 = createTreeFromArray(arr1);
        TreeNode root2 = createTreeFromArray(arr2);

        assertEquals(true, solution.leafSimilarTrees(root1, root2));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithmFalse(Solution solution) {
        Integer[] arr1 = {1, 2, 3};
        Integer[] arr2 = {1, 3, 2};

        TreeNode root1 = createTreeFromArray(arr1);
        TreeNode root2 = createTreeFromArray(arr2);

        assertEquals(false, solution.leafSimilarTrees(root1, root2));
    }
}
