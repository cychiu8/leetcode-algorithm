package leetcode.algorithm.KoKoEatingBananas;

import java.util.Arrays;

public class BasicSolution extends Solution {

    @Override
    public int koKoEatingBananas(int[] piles, int h) {
        int n = piles.length;
        Arrays.sort(piles);
        long low = 1;
        long high = piles[n - 1];
        while (low <= high) {
            long mid = low + (high - low) / 2;
            if (isFeasible(mid, piles, h)) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return (int) low;
    }

    private boolean isFeasible(long speed, int[] piles, int hours) {
        long totalT = 0;
        for (int pile : piles) {
            long div = pile / speed;
            totalT += div;
            if (pile % speed != 0)
                totalT++;
        }
        return totalT <= hours;

    }

}
