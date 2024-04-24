package leetcode.algorithm.MergeStringsAlternately;

/*
 * 1768. Merge Strings Alternately
 * URL: https://leetcode.com/problems/merge-strings-alternately/
 * 
 * Given two strings word1 and word2, merge the strings by adding letters in alternating order, starting with word1.
 * If a string is longer than the other, append the additional letters onto the end of the merged string.
 */

 public class Solution {
    public String mergeAlternately(String word1, String word2) {
        // pointer to keep track of the current index of the first string
        int curInxInWord = 0;
        // pointer to keep track of the current index of the merged string
        int curInxInMerged = 0;

        // create a char array to store the merged string
        char[] merged = new char[word1.length() + word2.length()];

        // loop through the merged array
        while (curInxInMerged < merged.length) {
            if(curInxInWord < word1.length()) {
                // add the current index to the merged string
                merged[curInxInMerged] = word1.charAt(curInxInWord);
                curInxInMerged++;
            }
            
            if(curInxInWord < word2.length()) {
                merged[curInxInMerged] = word2.charAt(curInxInWord);
                curInxInMerged++;
            }

            curInxInWord++;
        }

        // return the merged string
        return new String(merged);

    }
}


