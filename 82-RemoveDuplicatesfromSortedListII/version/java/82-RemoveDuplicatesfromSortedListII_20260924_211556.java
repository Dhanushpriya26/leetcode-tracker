// Last updated: 9/24/2026, 9:15:56 PM
1class Solution {
2    public void convertAndCheck(int i, int j, char[][] board, int rows, int cols) {
3        if (board[i][j] != 'O')
4            return;
5
6
7        board[i][j] = '*';
8
9
10        if (i - 1 >= 0)
11            convertAndCheck(i - 1, j, board, rows, cols);
12        if (i + 1 <= rows)
13            convertAndCheck(i + 1, j, board, rows, cols);
14        if (j - 1 >= 0)
15            convertAndCheck(i, j - 1, board, rows, cols);
16        if (j + 1 <= cols)
17            convertAndCheck(i, j + 1, board, rows, cols);
18    }
19
20
21    public void solve(char[][] board) {
22        int rows = board.length - 1;
23        int cols = board[0].length - 1;
24
25
26        for (int i = 0; i <= rows; i++) {
27            convertAndCheck(i, 0, board, rows, cols);
28            convertAndCheck(i, cols, board, rows, cols);
29        }
30
31
32        for (int j = 1; j < cols; j++) {
33            convertAndCheck(0, j, board, rows, cols);
34            convertAndCheck(rows, j, board, rows, cols);
35        }
36
37
38        for (int i = 0; i <= rows; i++) {
39            for (int j = 0; j <= cols; j++) {
40                if (board[i][j] == '*')
41                    board[i][j] = 'O';
42                else if (board[i][j] == 'O')
43                    board[i][j] = 'X';
44            }
45        }
46    }
47}