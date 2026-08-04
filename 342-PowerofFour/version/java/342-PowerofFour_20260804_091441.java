// Last updated: 8/4/2026, 9:14:41 AM
1class Solution {
2    public boolean isPowerOfFour(int n) {
3        if (n <= 0) {
4            return false;
5        }
6        return Math.log(n) / Math.log(4) %1==0;       
7    }
8}