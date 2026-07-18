// Last updated: 7/18/2026, 6:47:53 PM
1class Solution {
2    public int lengthOfLongestSubstring(String s) {
3        int n = s.length();
4        int maxLength = 0;
5        Set<Character> charSet = new HashSet<>();
6        int left = 0;
7        for (int right = 0; right < n; right++) {
8            if (!charSet.contains(s.charAt(right))) {
9                charSet.add(s.charAt(right));
10                maxLength = Math.max(maxLength, right - left + 1);
11            } else {
12                while (charSet.contains(s.charAt(right))) {
13                    charSet.remove(s.charAt(left));
14                    left++;
15                }
16                charSet.add(s.charAt(right));
17            }
18        }
19        return maxLength;
20    }
21}