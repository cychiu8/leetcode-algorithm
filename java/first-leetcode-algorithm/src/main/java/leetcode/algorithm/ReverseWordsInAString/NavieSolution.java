package leetcode.algorithm.ReverseWordsInAString;


public class NavieSolution extends Solution {

    @Override
    public String reverseWordsInAString(String s){
        StringBuilder results = new StringBuilder();

        // split the string by spaces
        String[] words = s.split("\\s+");
        // trace the words in reverse order
        for(int i = words.length - 1; i >= 0; i--){
            results.append(words[i]);
            if (i != 0) {
                results.append(" ");
            }
        }

        return results.toString().trim();

        // Follow-up: If the string data type is mutable in your language, can you solve it in-place with O(1) extra space?
        // In Java, the string data type is immutable
        // Time complexity: O(n)
        // Space complexity: O(n)
    }
}