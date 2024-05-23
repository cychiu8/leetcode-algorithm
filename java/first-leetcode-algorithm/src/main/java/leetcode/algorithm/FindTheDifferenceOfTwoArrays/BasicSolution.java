package leetcode.algorithm.FindTheDifferenceOfTwoArrays;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class BasicSolution extends Solution {
    @Override
    public List<List<Integer>> findTheDifferenceOfTwoArrays(int[] nums1, int[] nums2) {
        List<List<Integer>> results = new ArrayList<>();

        // two map for search
        HashMap<Integer, Integer> map1 = new HashMap<>();
        HashMap<Integer, Integer> map2 = new HashMap<>();
        List<Integer> diff1 = new ArrayList<>();
        List<Integer> diff2 = new ArrayList<>();

        for (int num : nums1) {
            if (!map1.containsKey(num)) {
                map1.put(num, 1);
            }
        }
        for (int num : nums2) {
            if (!map2.containsKey(num)) {
                map2.put(num, 1);
            }
            if (!map1.containsKey(num) && !diff2.contains(num)) {
                diff2.add(num);
            }
        }
        for (int num : nums1) {
            if (!map2.containsKey(num) && !diff1.contains(num)) {
                diff1.add(num);
            }
        }

        results.add(diff1);
        results.add(diff2);

        return results;
    }

}
