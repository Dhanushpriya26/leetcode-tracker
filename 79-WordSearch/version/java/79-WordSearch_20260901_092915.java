// Last updated: 9/1/2026, 9:29:15 AM
1public class Solution {
2    public boolean exist(char[][] board, String word) {
3        int m = board.length;
4        int n = board[0].length;
5        boolean[][] visited = new boolean[m][n];
6        boolean result = false;
7        for (int i = 0; i < m; i++) {
8            for (int j = 0; j < n; j++) {
9                if (board[i][j] == word.charAt(0)) {
10                    result = backtrack(board, word, visited, i, j, 0);
11                    if (result) return true;
12                }
13            }
14        }   
15        return false;
16    }
17    private boolean backtrack(char[][] board, String word, boolean[][] visited, int i, int j, int index) {
18        if (index == word.length()) {
19            return true;
20        }
21        
22        if (i < 0 || i >= board.length || j < 0 || j >= board[0].length || visited[i][j] || board[i][j] != word.charAt(index)) {
23            return false;
24        }
25        
26        visited[i][j] = true;
27        
28        if (backtrack(board, word, visited, i + 1, j, index + 1) ||
29            backtrack(board, word, visited, i - 1, j, index + 1) ||
30            backtrack(board, word, visited, i, j + 1, index + 1) ||
31            backtrack(board, word, visited, i, j - 1, index + 1)) {
32            return true;
33        }
34        
35        visited[i][j] = false;
36        return false;
37    }
38}