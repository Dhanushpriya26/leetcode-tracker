// Last updated: 9/18/2026, 10:55:39 PM
1class Solution {
2    public int reverse(int x) {
3
4        int rev = 0;
5
6        while (x != 0) {
7
8            int digit = x % 10;
9
10            // Check overflow
11            if (rev > Integer.MAX_VALUE / 10 ||
12                rev < Integer.MIN_VALUE / 10) {
13                return 0;
14            }
15
16            rev = rev * 10 + digit;
17
18            x = x / 10;
19        }
20
21        return rev;
22    }
23}