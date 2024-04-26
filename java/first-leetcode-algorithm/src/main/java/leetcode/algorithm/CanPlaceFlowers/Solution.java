package leetcode.algorithm.CanPlaceFlowers;

/*
 * 605. Can Place Flowers
 * URL: https://leetcode.com/problems/can-place-flowers/?envType=study-plan-v2&envId=leetcode-75
 */
public class Solution {
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        boolean result = false;

        // check edge cases
        if (flowerbed.length == 1) {
            if(flowerbed[0] == 0 && n <=1) {
                return true;
            }
        }

        // place new flower
        for (int i = 0; i < flowerbed.length; i++) {
            if(flowerbed[i] == 1) {
                continue;
            }

            if(i == 0) {
                if(flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
            } else if (i == flowerbed.length - 1) {
                if(flowerbed[i - 1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
            } else {
                if(flowerbed[i - 1] == 0 && flowerbed[i + 1] == 0) {
                    flowerbed[i] = 1;
                    n--;
                }
            }
        }

        // whether the number of candidates is greater than the number of new flows
        if(n <= 0) {
            result = true;
        }
        return result;
    }
}
