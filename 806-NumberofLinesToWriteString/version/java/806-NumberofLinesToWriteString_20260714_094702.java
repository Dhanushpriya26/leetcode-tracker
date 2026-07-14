// Last updated: 7/14/2026, 9:47:02 AM
1class Solution {
2    public int[] numberOfLines(int[] widths, String s) {
3        int lines = 1, sum = 0;
4        for(char c : s.toCharArray()) {
5            int w = widths[c - 'a'];
6            if(sum + w > 100) {
7                lines++;
8                sum = 0;
9            }
10            sum += w;
11        }
12        return new int[]{lines, sum};
13    }
14}