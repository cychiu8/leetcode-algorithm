package leetcode.algorithm.LetterCombinationsOfAPhoneNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class AdvancedSolution extends Solution {

    /* backtracking */
    // stop criteria: when the digit is the same as the input one
    // otherwise: backtrack the rest of array

    @Override
    public List<String> letterCombinationsOfAPhoneNumber(String digits) {

        Queue<String> results = new LinkedList<>();

        if (digits.length() == 0)
            return new ArrayList<>(results);

        // use a map to memorize the digits and corresponding letters
        Map<Integer, List<String>> digitsMap = intialDigitsMap();
        backtrack("", digits, digitsMap, results);

        return new ArrayList<>(results);
    }

    private void backtrack(String combination, String res, Map<Integer, List<String>> digitsMap,
            Queue<String> results) {

        if (res.length() == 0) {
            results.add(combination);
        } else {
            for (String letter : digitsMap.get(Character.getNumericValue(res.charAt(0)))) {
                backtrack(combination + letter, res.substring(1), digitsMap, results);
            }

        }
    }

    private Map<Integer, List<String>> intialDigitsMap() {
        Map<Integer, List<String>> digitsMap = new HashMap<>();
        digitsMap.put(2, Arrays.asList("a", "b", "c"));
        digitsMap.put(3, Arrays.asList("d", "e", "f"));
        digitsMap.put(4, Arrays.asList("g", "h", "i"));
        digitsMap.put(5, Arrays.asList("j", "k", "l"));
        digitsMap.put(6, Arrays.asList("m", "n", "o"));
        digitsMap.put(7, Arrays.asList("p", "q", "r", "s"));
        digitsMap.put(8, Arrays.asList("t", "u", "v"));
        digitsMap.put(9, Arrays.asList("w", "x", "y", "z"));
        return digitsMap;
    }

}
