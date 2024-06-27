package leetcode.algorithm.CombinationSumIII;

import java.util.ArrayList;
import java.util.List;

public class BasicSolution extends Solution {

    @Override
    public List<List<Integer>> combinationSumIII(int k, int n) {
        // combination -> backtracking
        // stopping criteria -> sum = n; size = k
        // otherwise -> backtracking
        List<List<Integer>> results = new ArrayList<>();
        backtracking(new ArrayList<Integer>(), 1, k, n, results);
        return results;
    }

    public void backtracking(List<Integer> subList, int startIdx, int k, int resSum,
            List<List<Integer>> results) {
        if (subList.size() > k || resSum < 0)
            return;
        if (subList.size() == k && resSum == 0) {
            List<Integer> ans = new ArrayList<>(subList);
            results.add(ans);
            return;
        }
        for (int i = startIdx; i < 10; i++) {
            subList.add(i);
            backtracking(subList, i + 1, k, resSum - i, results);
            subList.remove(subList.size() - 1);
        }
    }

}
