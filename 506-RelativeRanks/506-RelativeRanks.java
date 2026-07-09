// Last updated: 7/9/2026, 9:17:07 AM
class Solution {
    public String[] findRelativeRanks(int[] score) {
        int n = score.length;
        String[] result = new String[n];

        int[][] athletes = new int[n][2];

        for (int i = 0; i < n; i++) {
            athletes[i][0] = score[i]; 
            athletes[i][1] = i;       
        }

        Arrays.sort(athletes, (a, b) -> b[0] - a[0]);

        for (int rank = 0; rank < n; rank++) {
            int idx = athletes[rank][1];

            if (rank == 0) {
                result[idx] = "Gold Medal";
            } else if (rank == 1) {
                result[idx] = "Silver Medal";
            } else if (rank == 2) {
                result[idx] = "Bronze Medal";
            } else {
                result[idx] = String.valueOf(rank + 1);
            }
        }

        return result;
    }
}