// Last updated: 8/5/2026, 8:30:08 PM
1class Solution {
2    public int maximalRectangle(char[][] matrix) {
3        if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
4            return 0;
5        int M = matrix.length;
6        int N = matrix[0].length;
7        int[][] mat = new int[M][N];
8        for (int i = 0; i < M; i++) {
9            for (int j = 0; j < N; j++) {
10                mat[i][j] = matrix[i][j] - '0';
11            }
12        }
13        for (int i = 0; i < M; i++) {
14            for (int j = 1; j < N; j++) {
15                if (mat[i][j] == 1) {
16                    mat[i][j] += mat[i][j - 1];
17                }
18            }
19        }
20        int Ans = 0;
21        for (int j = 0; j < N; j++) {
22            for (int i = 0; i < M; i++) {
23                int width = mat[i][j];
24                if (width == 0) continue;
25                int currWidth = width;
26                for (int k = i; k < M && mat[k][j] > 0; k++) {
27                    currWidth = Math.min(currWidth, mat[k][j]);
28                    int height = k - i + 1;
29                    Ans = Math.max(Ans, currWidth * height);
30                }
31                currWidth = width;
32                for (int k = i; k >= 0 && mat[k][j] > 0; k--) {
33                    currWidth = Math.min(currWidth, mat[k][j]);
34                    int height = i - k + 1;
35                    Ans = Math.max(Ans, currWidth * height);
36                }
37            }
38        }
39        return Ans;
40    }
41}