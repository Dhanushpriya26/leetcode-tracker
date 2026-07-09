// Last updated: 7/9/2026, 9:16:20 AM
class Solution {
    int[] rows = {-1, 1, 0, 0};
    int[] cols = {0, 0, -1, 1};
    int n, m;

    boolean isValid(int r, int c) {
        return r >= 0 && r < n && c >= 0 && c < m;
    }

    void dfs(int r, int c, int original, int color, int[][] image) {
        for (int k = 0; k < 4; k++) {
            int nr = r + rows[k];
            int nc = c + cols[k];

            if (isValid(nr, nc) && image[nr][nc] == original) {
                image[nr][nc] = color;
                dfs(nr, nc, original, color, image);
            }
        }
    }

    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) return image;

        n = image.length;
        m = image[0].length;

        int original = image[sr][sc];
        image[sr][sc] = color;

        dfs(sr, sc, original, color, image);
        return image;
    }
}
