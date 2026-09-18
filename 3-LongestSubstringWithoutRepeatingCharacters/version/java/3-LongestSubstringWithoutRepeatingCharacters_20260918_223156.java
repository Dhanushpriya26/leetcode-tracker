// Last updated: 9/18/2026, 10:31:56 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3
4        int[] last = new int[128];
5
6        int left = 0;
7        int max = 0;
8
9        for (int right = 0; right < s.length(); right++) {
10
11            char c = s.charAt(right);
12
13            left = Math.max(left, last[c]);
14
15            max = Math.max(max, right - left + 1);
16
17            last[c] = right + 1;
18        }
19
20        return max;
21    }
22}