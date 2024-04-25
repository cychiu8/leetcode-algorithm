package leetcode.algorithm.KidsWithTheGreatestNumberOfCandies;

import java.util.List;
import java.util.ArrayList;

/*
 * 1431. Kids with the greatest number of candies
 * URL: https://leetcode.com/problems/kids-with-the-greatest-number-of-candies/description/?envType=study-plan-v2&envId=leetcode-75
 */
public class Solution {
    public List<Boolean> kidsWithTheGreatestNumberOfCandies(int[] candies, int extraCandies){
        // find original greatest number of candies
        int greatestNumberOfCandies = Integer.MIN_VALUE;
        for(int candy : candies){
            if (candy > greatestNumberOfCandies) {
                greatestNumberOfCandies = candy;
            }
        }
        // if the number of candies add extraCandies larger than the original greatest one then it becomes the greatest one
        List<Boolean> results = new ArrayList<>();
        for(int candy : candies) {
            if(candy + extraCandies >= greatestNumberOfCandies) {
                results.add(true);
            } else {
                results.add(false);
            }
        }

        return results;
    }
}
