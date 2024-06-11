package leetcode.algorithm.PathSumIII;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

public class SolutionTest {

    static Stream<Solution> solutions() {
        return Stream.of(new BasicSolution());
    }

    private TreeNode insertTreeFromArray(Integer[] arr, int i) {
        if (i >= arr.length)
            return null;
        if (arr[i] == null)
            return null;

        TreeNode newNode = new TreeNode(arr[i]);
        newNode.left = insertTreeFromArray(arr, 2 * i + 1);
        newNode.right = insertTreeFromArray(arr, 2 * i + 2);
        return newNode;
    }

    private TreeNode createTreeFromArray(Integer[] arr) {
        return insertTreeFromArray(arr, 0);
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm(Solution solution) {
        Integer[] arr = {10, 5, -3, 3, 2, null, 11, 3, -2, null, 1};
        int tartgetSum = 8;
        int expected = 3;
        TreeNode root = createTreeFromArray(arr);
        assertEquals(expected, solution.pathSumIII(root, tartgetSum));
    }

    @ParameterizedTest
    @MethodSource("solutions")
    public void testAlgorithm2(Solution solution) {
        Integer[] arr = {5, 4, 8, 11, null, 13, 4, 7, 2, null, null, 5, 1};
        int tartgetSum = 22;
        int expected = 3;
        TreeNode root = createTreeFromArray(arr);
        assertEquals(expected, solution.pathSumIII(root, tartgetSum));
    }
}
