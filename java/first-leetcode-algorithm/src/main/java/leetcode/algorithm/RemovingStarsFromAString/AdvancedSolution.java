package leetcode.algorithm.RemovingStarsFromAString;

import java.util.Stack;

public class AdvancedSolution extends Solution {

    @Override
    public String removingStarsFromAString(String s) {

        // turns to linked list
        // time complexity: O(n)
        Stack<Character> stack = new Stack<>();

        for (char c : s.toCharArray()) {
            // when it find '*' then pop the last node
            if (c == '*') {
                stack.pop();
            } else {
                stack.add(c);
            }
        }

        StringBuilder result = new StringBuilder();
        for (Character c : stack) {
            result.append(c);
        }
        return result.toString();
    }

}
