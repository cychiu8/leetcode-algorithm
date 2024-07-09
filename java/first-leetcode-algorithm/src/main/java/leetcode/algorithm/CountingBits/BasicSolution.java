package leetcode.algorithm.CountingBits;

public class BasicSolution extends Solution {

    @Override
    public int[] countingBits(int n) {
        // create the length of the answer
        int[] ans = new int[n + 1];
        // for each number count the binaray representation
        for (int i = 0; i <= n; i++) {
            String binaryString = Integer.toBinaryString(i);
            System.out.println(binaryString);
            ans[i] = numberOfOne(binaryString);
        }
        return ans;
    }

    int numberOfOne(String s) {
        int count = 0;
        for (char c : s.toCharArray()) {
            if (c == '1')
                count++;
        }
        System.out.println(count);
        return count;
    }

}
