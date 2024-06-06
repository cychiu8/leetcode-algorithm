package leetcode.algorithm.LeafSimilarTrees;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Stack;

public class BasicSolution extends Solution {

    public int[] leafValSeq(TreeNode root) {
        ArrayList<Integer> resultArray = new ArrayList<>();
        Stack<TreeNode> stack = new Stack<>();

        stack.add(root);
        while (!stack.isEmpty()) {
            TreeNode cur = stack.pop();
            if (cur == null)
                continue;
            stack.add(cur.right);
            stack.add(cur.left);

            if (cur.left == null && cur.right == null)
                resultArray.add(cur.val);
        }

        int[] result = new int[resultArray.size()];
        for (int i = 0; i < resultArray.size(); i++) {
            result[i] = resultArray.get(i);
            System.out.print(result[i]);
            System.out.print("->");
        }
        System.out.println();
        System.out.println(Arrays.toString(result));
        return result;
    }

    @Override
    public boolean leafSimilarTrees(TreeNode root1, TreeNode root2) {

        int[] seq1 = leafValSeq(root1);
        int[] seq2 = leafValSeq(root2);

        return Arrays.equals(seq1, seq2);
    }

}
