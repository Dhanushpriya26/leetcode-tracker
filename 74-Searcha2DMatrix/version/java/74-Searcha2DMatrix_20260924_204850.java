// Last updated: 9/24/2026, 8:48:50 PM
1class Solution {
2    public boolean searchMatrix(int[][] matrix, int target) {
3        int m = matrix.length;
4
5        if(m == 0) return false;
6
7        int n = matrix[0].length;
8
9        int low = 0;
10        int high = (m * n) - 1;
11        while(low <= high) {
12            int mid = low + (high - low) / 2;
13
14            int row = mid / n;
15            int col = mid % n;
16
17            if(matrix[row][col] == target)
18                return true;
19
20            if(matrix[row][col] < target)
21                low = mid + 1;
22            else
23                high = mid - 1;
24        }
25
26        return false;
27    }
28}