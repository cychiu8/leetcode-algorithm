package leetcode.algorithm.DetermineIfTwoStringsAreClose;

import java.util.HashMap;

public class BasicSolution extends Solution {
    @Override
    public boolean determineIfTwoStringsAreClose(String word1, String word2) {
        // space complexity: O(n)
        // time complexity: O(n)
        HashMap<Character, Integer> occMap1 = new HashMap<>();
        HashMap<Character, Integer> occMap2 = new HashMap<>();

        for (char c : word1.toCharArray()) {
            occMap1.put(c, occMap1.getOrDefault(c, 0) + 1);
        }
        for (char c : word2.toCharArray()) {
            occMap2.put(c, occMap2.getOrDefault(c, 0) + 1);
        }

        // same characters
        if (!occMap1.keySet().equals(occMap2.keySet())) {
            return false;
        }

        HashMap<Integer, Integer> occ1 = new HashMap<>();
        HashMap<Integer, Integer> occ2 = new HashMap<>();

        // same as occurance
        for (int i : occMap1.values()) {
            occ1.put(i, occ1.getOrDefault(i, 0) + 1);
        }
        for (int i : occMap2.values()) {
            occ2.put(i, occ2.getOrDefault(i, 0) + 1);
        }

        if (!occ1.equals(occ2)) {
            return false;
        }

        return true;
    }

}
