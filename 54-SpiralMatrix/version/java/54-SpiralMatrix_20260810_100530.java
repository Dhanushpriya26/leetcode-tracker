// Last updated: 8/10/2026, 10:05:30 AM
1class Solution {
2    public List<Integer> spiralOrder(int[][] matrix) {
3        int rows = matrix.length;
4        int cols = matrix[0].length;
5        int x = 0;
6        int y = 0;
7        int dx = 1;
8        int dy = 0;
9        List<Integer> res = new ArrayList<>();
10
11        for (int i = 0; i < rows * cols; i++) {
12            res.add(matrix[y][x]);
13            matrix[y][x] = -101;
14
15            if (!(0 <= x + dx && x + dx < cols && 0 <= y + dy && y + dy < rows) || matrix[y+dy][x+dx] == -101) {
16                int temp = dx;
17                dx = -dy;
18                dy = temp;
19            }
20
21            x += dx;
22            y += dy;
23        }
24
25        return res;        
26    }
27}