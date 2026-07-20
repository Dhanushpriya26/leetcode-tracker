// Last updated: 7/20/2026, 7:03:18 PM
1class Solution {
2    public int longestSubstring(String s, int k) {
3
4        int longestLen = 0;
5        int n = s.length();
6
7        for(int targetUniqueChars = 1; targetUniqueChars <= 26; targetUniqueChars++) {
8
9            int[] charFreq = new int[26];
10
11            int uniqueChars = 0;
12            int charsMeetingKFreq = 0;
13
14            int left = 0, right = 0;
15
16            while(right < n) {
17
18                char currChar = s.charAt(right);
19
20                if(charFreq[currChar - 'a'] == 0)
21                    uniqueChars++;
22
23                if(charFreq[currChar - 'a'] == k - 1)
24                    charsMeetingKFreq++;
25
26                charFreq[currChar - 'a']++;
27
28                while(uniqueChars > targetUniqueChars) {
29
30                    char leftChar = s.charAt(left);
31
32                    if(charFreq[leftChar - 'a'] == 1)
33                        uniqueChars--;
34
35                    if(charFreq[leftChar - 'a'] == k)
36                        charsMeetingKFreq--;
37
38                    charFreq[leftChar - 'a']--;
39                    left++;
40                }
41
42                if(uniqueChars == targetUniqueChars &&
43                   charsMeetingKFreq == uniqueChars) {
44
45                    longestLen = Math.max(longestLen, right - left + 1);
46                }
47
48                right++;
49            }
50        }
51
52        return longestLen;
53    }
54}