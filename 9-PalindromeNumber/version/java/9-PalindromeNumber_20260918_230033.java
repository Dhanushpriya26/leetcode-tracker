// Last updated: 9/18/2026, 11:00:33 PM
1class Solution {
2    public boolean isPalindrome(int x) {
3        if (x < 0) {
4            return false;
5        }
6
7        int reverse = 0;
8        int xcopy = x;
9
10        while (x > 0) {
11            reverse = (reverse * 10) + (x % 10);
12            x /= 10;
13        }
14
15        return reverse == xcopy;        
16    }
17}