package leetcode.algorithm.FindTheDifferenceOfTwoArrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class AdvancedSolution extends Solution {
    @Override
    public List<List<Integer>> findTheDifferenceOfTwoArrays(int[] nums1, int[] nums2) {
        Set<Integer> distinct1 = new HashSet<>();
        Set<Integer> distinct2 = new HashSet<>();

        Set<Integer> diff1 = new HashSet<>();
        Set<Integer> diff2 = new HashSet<>();

        for (int num : nums1) {
            if (!distinct1.contains(num)) {
                distinct1.add(num);
            }
        }

        for (int num : nums2) {
            if (!distinct2.contains(num)) {
                distinct2.add(num);
            }
            if (!distinct1.contains(num)) {
                diff2.add(num);
            }
        }

        for (int num : nums1) {
            if (!distinct2.contains(num)) {
                diff1.add(num);
            }
        }



        return Arrays.asList(new ArrayList<>(diff1), new ArrayList<>(diff2));
    }

}
