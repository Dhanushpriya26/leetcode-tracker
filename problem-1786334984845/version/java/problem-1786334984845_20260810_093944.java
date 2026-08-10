// Last updated: 8/10/2026, 9:39:44 AM
1class Solution {
2    public boolean winnerSquareGame(int n) {
3        boolean[] dp = new boolean[n + 1];
4
5        for (int i = 1; i <= n; i++) {
6            for (int j = 1; j * j <= i; j++) {
7                if (!dp[i - j * j]) {
8                    dp[i] = true;
9                    break;
10                }
11            }
12        }
13
14        return dp[n];
15    }
16}