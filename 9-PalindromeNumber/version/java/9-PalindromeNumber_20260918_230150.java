// Last updated: 9/18/2026, 11:01:50 PM
1class Solution {
2    public boolean isPalindrome(int x) {
3
4        if (x < 0) {
5            return false;
6        }
7
8        int reverse = 0;
9        int copy = x;
10
11        while (x > 0) {
12            int digit = x % 10;
13            reverse = reverse * 10 + digit;
14            x = x / 10;
15        }
16
17        return reverse == copy;
18    }
19}