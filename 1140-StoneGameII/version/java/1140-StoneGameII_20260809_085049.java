// Last updated: 8/9/2026, 8:50:49 AM
1class Solution {
2
3    public int stoneGameII(int[] piles) {
4        int length = piles.length;
5        int[][] dp = new int[length + 1][length + 1];
6        int[] suffixSum = new int[length + 1];
7        for (int i = length - 1; i >= 0; i--) {
8            suffixSum[i] = suffixSum[i + 1] + piles[i];
9        }
10        for (int i = 0; i <= length; i++) {
11            dp[i][length] = suffixSum[i];
12        }
13        for (int index = length - 1; index >= 0; index--) {
14            for (int maxTillNow = length - 1; maxTillNow >= 1; maxTillNow--) {
15                for (
16                    int X = 1;
17                    X <= 2 * maxTillNow && index + X <= length;
18                    X++
19                ) {
20                    dp[index][maxTillNow] = Math.max(
21                        dp[index][maxTillNow],
22                        suffixSum[index] -
23                        dp[index + X][Math.max(maxTillNow, X)]
24                    );
25                }
26            }
27        }
28        return dp[0][1];
29    }
30}