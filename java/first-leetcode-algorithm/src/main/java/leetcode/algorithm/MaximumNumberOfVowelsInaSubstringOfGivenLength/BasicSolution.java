package leetcode.algorithm.MaximumNumberOfVowelsInaSubstringOfGivenLength;

import java.util.Arrays;
import java.util.List;

public class BasicSolution extends Solution {
    @Override
    public int maximumNumberOfVowelsInaSubstringOfGivenLength(String s, int k) {

        int curCount = 0;

        List<Character> vowels = Arrays.asList('a', 'e', 'i', 'o', 'u');

        // loop from the first window
        for (int i = 0; i < k; i++) {
            if (vowels.contains(s.charAt(i))) {
                curCount++;
            }
        }

        int maxCount = curCount;

        if (maxCount == k) {
            return maxCount;
        }

        // move the window
        for (int i = 0; i < s.length() - k; i++) {
            // remove the previous one
            if (vowels.contains(s.charAt(i))) {
                curCount--;
            }

            // consider the next one
            if (vowels.contains(s.charAt(i + k))) {
                curCount++;
            }

            maxCount = Math.max(maxCount, curCount);
            if (maxCount == k) {
                return maxCount;
            }
        }

        return maxCount;
    }

}
