// Last updated: 8/6/2026, 8:55:16 AM
1class Solution {
2    public int smallestNumber(int n, int t) {
3        int q = n / 10, r = n % 10;
4        int req = t / gcd(q + (10 - q) / 10, t);
5        int nxt = ((r + req - 1) / req) * req;
6        int x = nxt - (nxt - 10) * (nxt / 10);
7        return q * 10 + x;
8    }
9    private int gcd(int a, int b) {
10        return (b == 0) ? a : gcd(b, a % b);
11    }
12}