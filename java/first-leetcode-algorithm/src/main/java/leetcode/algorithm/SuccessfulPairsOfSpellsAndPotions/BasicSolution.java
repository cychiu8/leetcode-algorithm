package leetcode.algorithm.SuccessfulPairsOfSpellsAndPotions;

import java.util.Arrays;

public class BasicSolution extends Solution {

    @Override
    public int[] successfulPairsOfSpellsAndPotions(int[] spells, int[] potions, long success) {
        int n = spells.length;
        int m = potions.length;
        int[] results = new int[n];

        Arrays.sort(potions);

        for (int i = 0; i < n; i++) {
            int low = 0;
            int high = m - 1;
            while (low <= high) {
                int mid = low + (high - low) / 2;
                long product = (long) spells[i] * potions[mid];
                if (product >= success) {
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            results[i] = m - low;
        }

        return results;
    }

}
