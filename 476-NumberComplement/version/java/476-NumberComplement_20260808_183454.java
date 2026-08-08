// Last updated: 8/8/2026, 6:34:54 PM
1class Solution {
2    public int findComplement(int num) {
3        if (num == 0) return 1;
4        int bitLength = Integer.toBinaryString(num).length();
5        int mask = (1 << bitLength) - 1;
6        return num ^ mask;
7    }
8}