package leetcode.algorithm.LetterCombinationsOfAPhoneNumber;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class BasicSolution extends Solution {

    @Override
    public List<String> letterCombinationsOfAPhoneNumber(String digits) {

        Queue<String> results = new LinkedList<>();
        // use a map to memorize the digits and corresponding letters
        Map<Integer, List<String>> digitsMap = intialDigitsMap();
        char[] digitsList = digits.toCharArray();
        // add the letters one after one
        for (char digit : digitsList) {
            results = addChar(results, digit, digitsMap);
        }
        return new ArrayList<>(results);
    }

    private Queue<String> addChar(Queue<String> results, char digit,
            Map<Integer, List<String>> digitsMap) {
        List<String> letters = digitsMap.get(Character.getNumericValue(digit));
        int n = results.size();
        if (n == 0) {
            for (String letter : letters) {
                results.add(letter);
            }
        }
        while (n > 0) {
            String tmp = results.poll();
            for (String letter : letters) {
                results.add(tmp + letter);
            }
            n--;
        }
        return results;
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
