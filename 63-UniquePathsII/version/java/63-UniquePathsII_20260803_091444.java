// Last updated: 8/3/2026, 9:14:44 AM
1class Solution {
2    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
3        int m = obstacleGrid.length;
4        int n = obstacleGrid[0].length;
5        if (obstacleGrid[m - 1][n - 1] == 1) {
6            return 0;
7        }
8        int[][] dp = new int[m][n];
9        for (int i = m - 1; i >= 0; i--) {
10            if (obstacleGrid[i][n - 1] == 0) {
11                dp[i][n - 1] = 1;
12            } else {
13                for (int j = i; j >= 0; j--) {
14                    dp[j][n - 1] = 0;
15                }
16                break;
17            }
18        }
19        for (int i = n - 1; i >= 0; i--) {
20            if (obstacleGrid[m - 1][i] == 0) {
21                dp[m - 1][i] = 1;
22            } else {
23                for (int j = i; j >= 0; j--) {
24                    dp[m - 1][j] = 0;
25                }
26                break;
27            }
28        }
29        for (int i = m - 2; i >= 0; i--) {
30            for (int j = n - 2; j >= 0; j--) {
31                if (obstacleGrid[i][j] == 1) {
32                    dp[i][j] = 0;
33                } else {
34                    dp[i][j] = dp[i + 1][j] + dp[i][j + 1];
35                }
36            }
37        }
38
39        return dp[0][0];
40    }
41}