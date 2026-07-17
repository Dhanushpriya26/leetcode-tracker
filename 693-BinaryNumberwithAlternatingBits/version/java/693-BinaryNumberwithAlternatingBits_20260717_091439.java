// Last updated: 7/17/2026, 9:14:39 AM
1class Solution {
2    public boolean hasAlternatingBits(int n) {
3        int x = n ^ (n >> 1);
4        return (x & (x + 1)) == 0;
5    }
6}