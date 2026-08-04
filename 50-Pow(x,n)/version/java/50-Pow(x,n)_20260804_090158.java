// Last updated: 8/4/2026, 9:01:58 AM
1class Solution {
2    public double myPow(double x, int n) {
3        return binaryExp(x, (long) n);
4    }
5    private double binaryExp(double x, long n) {
6        if (n == 0) {
7            return 1;
8        }  
9        if (n < 0) {
10            return 1.0 / binaryExp(x, -n);
11        }
12        if (n % 2 == 1) {
13            return x * binaryExp(x * x, (n - 1) / 2);
14        } else {
15            return binaryExp(x * x, n / 2);
16        }
17    }
18}