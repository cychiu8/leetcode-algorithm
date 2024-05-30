package leetcode.algorithm.DecodeString;

import java.util.Stack;

public class BasicSolution extends Solution {
    @Override
    public String decodeString(String s) {
        Stack<Integer> countStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder countBuilder = new StringBuilder();
        StringBuilder subBuilder = new StringBuilder();

        for (char c : s.toCharArray()) {

            if (Character.isDigit(c)) {
                countBuilder.append(c);
            } else if (c == '[') {
                // - '[': -> means new start of next count & substring
                // - push previoust count to count stack
                // - reset count to zero
                // - push substring into stack (intermidiate substring)
                countStack.push(Integer.valueOf(countBuilder.toString()));
                countBuilder = new StringBuilder();
                strStack.push(subBuilder);
                subBuilder = new StringBuilder();
            } else if (c == ']') {
                // -> means a substring can be decoded
                // - pop the count
                // - pop the intermediate substring
                // - add the substring for 'count' times

                int count = countStack.pop();
                StringBuilder temp = subBuilder;
                subBuilder = strStack.pop();
                while (count-- > 0) {
                    subBuilder.append(temp);
                }
            } else {
                subBuilder.append(c);
            }
        }


        return subBuilder.toString();
    }

}
