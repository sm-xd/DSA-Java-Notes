import java.util.Arrays;

public class _04_Leading_Ranks {
    class Solution {
        public String[] findRelativeRanks(int[] score) {
            int n = score.length;
            String[] result = new String[n];

            int[][] scoreWithIndex = new int[n][2];
            for (int i = 0; i < n; i++) {
                scoreWithIndex[i][0] = score[i];
                scoreWithIndex[i][1] = i;
            }

            Arrays.sort(scoreWithIndex, (a, b) -> Integer.compare(b[0], a[0]));

            for (int i = 0; i < n; i++) {
                int idx = scoreWithIndex[i][1];
                if (i == 0) {
                    result[idx] = "Gold Medal";
                } else if (i == 1) {
                    result[idx] = "Silver Medal";
                } else if (i == 2) {
                    result[idx] = "Bronze Medal";
                } else {
                    result[idx] = String.valueOf(i + 1);
                }
            }

            return result;
        }
    }

    public static void main(String[] args) {
        Solution sol = new _04_Leading_Ranks().new Solution();
        int[] score = {5, 4, 3, 2, 1};
        String[] result = sol.findRelativeRanks(score);
        System.out.println(Arrays.toString(result)); // Expected: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
    }   
}
