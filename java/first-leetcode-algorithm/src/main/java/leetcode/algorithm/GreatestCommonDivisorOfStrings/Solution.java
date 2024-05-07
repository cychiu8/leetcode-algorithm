package leetcode.algorithm.GreatestCommonDivisorOfStrings;

/*
 * 1071. Greatest Common Divisor of Strings
 * URL: https://leetcode.com/problems/greatest-common-divisor-of-strings/
 * 
 * For two strings s and t, we say "t divides s" if and only if s = t + ... + t (t concatenated with itself 1 or more times)
 * Given two strings str1 and str2, return the largest string x such that x divides both str1 and str2.
 */
public class Solution {
    public String gcdOfString(String str1, String str2) {
        
        // use min string as initial base string
        int minLength = str1.length();
        String base = new String(str1);

        if (str1.length() > str2.length()) {
            base = str2;
            minLength = str2.length();
        }

        // check is both string equals to the multiple of base string
        for (int i = minLength; i >= 1 ; i--) {
            if (str1.length() % i == 0 && str2.length() % i == 0) {
                int k1 = str1.length() / i;
                int k2 = str2.length() / i;
                if (str1.equals(base.substring(0,i).repeat(k1)) && str2.equals(base.substring(0,i).repeat(k2))) {
                    return base.substring(0,i);
                }
            }
        }

        return new String("");
    }
}
