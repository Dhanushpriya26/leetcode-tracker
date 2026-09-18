// Last updated: 9/18/2026, 10:33:31 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int[] last = new int[128];
4        int left = 0;
5        int max = 0;
6        for (int i = 0; i < s.length(); i++) {
7            char c = s.charAt(i);
8            left = Math.max(left, last[c]);
9            max = Math.max(max, i - left + 1);
10            last[c] = i + 1;
11        }
12        return max;
13    }
14}