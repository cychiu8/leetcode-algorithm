package leetcode.algorithm.StringCompression;

public class BasicSolution extends Solution {
    @Override
    public int stringCompression(char[] chars){

        int resultIdx = 0;
        int curIdx = 0;
        while(curIdx < chars.length) {
            int count = 1;

            // to compare the next to current
            while(curIdx+count < chars.length && chars[curIdx + count] == chars[curIdx]) {
                count++;
            }

            chars[resultIdx++] = chars[curIdx];
            if (count > 1) {
                char[] countArray = Integer.toString(count).toCharArray();
                for(int j = 0; j < countArray.length; j++) {
                    chars[resultIdx++] = countArray[j];
                }
            }
            curIdx += count;
        }
        return resultIdx;
    }

}
