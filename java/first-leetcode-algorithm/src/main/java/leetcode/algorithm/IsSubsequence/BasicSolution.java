package leetcode.algorithm.IsSubsequence;

public class BasicSolution extends Solution {
    @Override
    public boolean isSubsequence(String s, String t){
        
        int sIdx = 0;
        int tIdx = 0;

        if(s.length() == 0) {
            return true;
        }

        // loop two string
        while(sIdx<s.length() && tIdx < t.length()) {
            if(s.charAt(sIdx) == t.charAt(tIdx)){
                if(sIdx == s.length() - 1) {
                    return true;   
                }
                // when the same then move to next together
                sIdx++;
                tIdx++;
            } else {
                // else only move longer one
                tIdx++;
            }
        }
        
        return false;
    }

}
