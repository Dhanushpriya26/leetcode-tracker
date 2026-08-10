// Last updated: 8/10/2026, 10:00:24 AM
1public class Solution {
2    public boolean isInterleave(String s1, String s2, String s3) {
3        int m = s1.length(), n = s2.length(), l = s3.length();
4        if (m + n != l) return false;
5        boolean[] dp = new boolean[n + 1];
6        dp[0] = true;
7        for (int j = 1; j <= n; ++j) {
8            dp[j] = dp[j - 1] && s2.charAt(j - 1) == s3.charAt(j - 1);
9        }
10        for (int i = 1; i <= m; ++i) {
11            dp[0] = dp[0] && s1.charAt(i - 1) == s3.charAt(i - 1);
12            for (int j = 1; j <= n; ++j) {
13                dp[j] = (dp[j] && s1.charAt(i - 1) == s3.charAt(i + j - 1)) || (dp[j - 1] && s2.charAt(j - 1) == s3.charAt(i + j - 1));
14            }
15        }
16        
17        return dp[n];
18    }
19}