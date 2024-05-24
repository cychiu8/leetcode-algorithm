package leetcode.algorithm.UniqueNumberOfOccurrences;

import java.util.HashMap;
import java.util.HashSet;


public class BasicSolution extends Solution {
    @Override
    public boolean uniqueNumberOfOccurrences(int[] arr) {
        HashMap<Integer, Integer> OccMap = new HashMap<>();

        for (int num : arr) {
            OccMap.put(num, OccMap.getOrDefault(num, 0) + 1);
        }

        HashSet<Integer> OccSet = new HashSet<>();
        for (int num : OccMap.values()) {
            if (OccSet.contains(num)) {
                return false;
            }
            OccSet.add(num);
        }

        return true;
    }

}
