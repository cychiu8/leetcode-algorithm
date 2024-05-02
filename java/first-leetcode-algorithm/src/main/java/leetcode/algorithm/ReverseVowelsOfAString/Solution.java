package leetcode.algorithm.ReverseVowelsOfAString;

import java.util.Arrays;
import java.util.List;

/*
 * 345. Reverse Vowels of a String
 * URL: https://leetcode.com/problems/reverse-vowels-of-a-string/?envType=study-plan-v2&envId=leetcode-75
 */

public class Solution {
    public String reverseVowelsOfAString(String s){
        // loop for get the vowels of a string
        List<Character> vowels = Arrays.asList('a','e','i','o','u');
        StringBuilder vowelsOfAString = new StringBuilder();
        for (int i = 0; i < s.length(); i++){
            if (vowels.contains(Character.toLowerCase(s.charAt(i)))){ 
                vowelsOfAString.append(s.charAt(i));
            }
        }
        // loop for the string again when meet a vowel then change it from the reverse vowel string
        char[] results = s.toCharArray();
        int j = vowelsOfAString.length() - 1;
        for (int i = 0; i < results.length; i++) {
            if (vowels.contains(Character.toLowerCase(results[i]))) {
                results[i] = vowelsOfAString.charAt(j);
                j--;
            }
        }
        return new String(results);
    }
}
