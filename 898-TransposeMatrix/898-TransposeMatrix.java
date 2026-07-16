// Last updated: 7/16/2026, 9:14:41 AM
class Solution {
    public int[][] transpose(int[][] matrix) {
        int row = matrix[0].length;
        int col = matrix.length;

        int transpose[][] = new int[row][col];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                transpose[i][j] = matrix[j][i];
            }
        }

        return transpose;
    }
}