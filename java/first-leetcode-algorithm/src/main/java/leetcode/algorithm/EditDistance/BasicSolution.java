package leetcode.algorithm.EditDistance;

public class BasicSolution extends Solution {
    /*
     * time complexity: 2^n
     */

    @Override
    public int editDistance(String word1, String word2) {
        if (word1.equals(word2))
            return 0;
        if (word1.isEmpty())
            return word2.length();
        if (word2.isEmpty())
            return word1.length();
        // four possible actions
        // 1. first letter is the same
        if (word1.charAt(0) == word2.charAt(0))
            return editDistance(word1.substring(1), word2.substring(1));
        // ---- choose the minimum one
        // 2. insert
        // 3. delete
        // 4. replace
        int insert = 1 + editDistance(word1, word2.substring(1));
        int delete = 1 + editDistance(word1.substring(1), word2);
        int replace = 1 + editDistance(word1.substring(1), word2.substring(1));
        return Math.min(Math.min(insert, delete), replace);
    }

}
