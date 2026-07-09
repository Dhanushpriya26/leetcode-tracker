// Last updated: 7/9/2026, 9:15:59 AM
class Solution {
    public int findJudge(int n, int[][] trust) {
        if (n == 1) return 1;

        int[] trustScore = new int[n + 1];

        for (int[] t : trust) {
            int a = t[0];
            int b = t[1];

            trustScore[a]--; // a trusts someone
            trustScore[b]++; // b is trusted by someone
        }

        for (int i = 1; i <= n; i++) {
            if (trustScore[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }
}