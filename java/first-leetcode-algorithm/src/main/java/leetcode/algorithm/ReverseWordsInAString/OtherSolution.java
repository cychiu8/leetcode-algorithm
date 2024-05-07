package leetcode.algorithm.ReverseWordsInAString;

public class OtherSolution extends Solution {

    @Override
    public String reverseWordsInAString(String s){

        // reverse the entire string
        StringBuilder sb = new StringBuilder(s).reverse();
        s = sb.toString();

        // reverse each word
        int start = 0;
        int end = 0;
        int i = 0;
        int total = sb.length();

        StringBuilder result = new StringBuilder();
        while(start < total){

            // skip leading space
            while (i < total && s.charAt(i) == ' ') {
                i++;
            }

            // find the current words end
            start = i;
            while(i<total && s.charAt(i) != ' '){
                i++;
            }

            end = i;
            if (start < end) {
                StringBuilder word = new StringBuilder(s.substring(start, end)).reverse();

                result.append(word);
                result.append(" ");
            }
        }

        if(result.length() > 0) {
            result.setLength(result.length()-1);
        }
        return result.toString();
    }
}