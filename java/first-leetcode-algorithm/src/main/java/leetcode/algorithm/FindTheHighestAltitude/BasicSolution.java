package leetcode.algorithm.FindTheHighestAltitude;

public class BasicSolution extends Solution {
    @Override
    public int findTheHighestAltitude(int[] gain) {
        int curAlt = 0;
        int highestAlt = curAlt;
        for (int i = 0; i < gain.length; i++) {
            curAlt += gain[i];
            highestAlt = Math.max(highestAlt, curAlt);
        }
        return highestAlt;
    }

}
