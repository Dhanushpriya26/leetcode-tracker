// Last updated: 8/8/2026, 6:33:01 PM
1class Solution {
2    public int hammingDistance(int x, int y) {
3        int count = 0;
4        if (x == y)
5            return count;
6        while (x > 0 || y > 0) {
7            int xBit = 0;
8            int yBit = 0;
9            if (x > 0) {
10                xBit = x % 2;
11                x = Math.floorDiv(x, 2);
12            }
13            if (y > 0) {
14                yBit = y % 2;
15                y = Math.floorDiv(y, 2);
16            }
17            if (xBit != yBit)
18                count++;
19        }
20        return count;
21    }
22}