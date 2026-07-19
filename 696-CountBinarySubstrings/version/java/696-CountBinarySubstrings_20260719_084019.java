// Last updated: 7/19/2026, 8:40:19 AM
1class Solution {
2    public int countBinarySubstrings(String s) {
3        int prev = 0, curr = 1, count = 0;
4
5        for (int i = 1; i < s.length(); i++) {
6            if (s.charAt(i) == s.charAt(i - 1)) {
7                curr++;
8            } else {
9                count += Math.min(prev, curr);
10                prev = curr;
11                curr = 1;
12            }
13        }
14
15        count += Math.min(prev, curr);
16        return count;
17    }
18}
19