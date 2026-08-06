// Last updated: 8/6/2026, 8:59:54 AM
1class Solution {
2    public boolean isPerfectSquare(int num) {
3        if (num < 2) 
4        return true;
5        long low = 1, high = num;
6        while (low <= high) {
7            long mid = low + (high - low) / 2;
8            if (mid * mid == num) {
9                return true;
10            } else if (mid * mid > num) {
11                high = mid - 1;
12            } else {
13                low = mid + 1;
14            }
15        }
16
17        return false;
18    }
19}