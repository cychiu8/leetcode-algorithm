package leetcode.algorithm.DetermineIfTwoStringsAreClose;

import java.util.Arrays;

public class AdvancedSolution extends Solution {
    @Override
    public boolean determineIfTwoStringsAreClose(String word1, String word2) {
        // try to save the space complexity to O(1)
        // but time complexity will increase to O(nlog n)
        int numberOfChar = 26;
        int[] freq1 = new int[numberOfChar];
        int[] freq2 = new int[numberOfChar];

        // the frequency
        for (char c : word1.toCharArray()) {
            freq1[c - 'a']++;
        }

        for (char c : word2.toCharArray()) {
            freq2[c - 'a']++;
        }

        // same characters -> the zero parts are the same
        for (int i = 0; i < numberOfChar; i++) {
            if ((freq1[i] == 0 && freq2[i] != 0) || (freq2[i] == 0 && freq1[i] != 0)) {
                return false;
            }
        }

        // same frequency
        Arrays.sort(freq1);
        Arrays.sort(freq2);
        if (!Arrays.equals(freq1, freq2)) {
            return false;
        }
        return true;
    }
}
