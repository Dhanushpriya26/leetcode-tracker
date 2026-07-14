// Last updated: 7/14/2026, 9:54:03 AM
1class Solution {
2    public double largestTriangleArea(int[][] points) {
3        double maxArea = 0;
4        int n = points.length;
5        for (int i = 0; i < n; i++) {
6            for (int j = i + 1; j < n; j++) {
7                for (int k = j + 1; k < n; k++) {
8                    double a = getDist(points[i], points[j]);
9                    double b = getDist(points[j], points[k]);
10                    double c = getDist(points[k], points[i]);
11                    double S = (a + b + c) / 2.0;
12                    double radicand = S * (S - a) * (S - b) * (S - c);
13                    radicand = Math.max(0.0, radicand);
14                    double area = Math.sqrt(radicand);
15                    maxArea = Math.max(maxArea, area);
16                }
17            }
18        }
19        return maxArea;
20    }
21    private double getDist(int[] p1, int[] p2) {
22        int dx = p1[0] - p2[0];
23        int dy = p1[1] - p2[1];
24        return Math.sqrt(dx * dx + dy * dy);
25    }
26}