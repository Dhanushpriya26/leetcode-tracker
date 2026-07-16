// Last updated: 7/16/2026, 8:58:08 AM
1class Solution {
2    public String mostCommonWord(String paragraph, String[] banned) {
3        String lower = paragraph.toLowerCase();
4        String[] words = lower.split("[^a-z]+");
5        HashMap<String, Integer> map = new HashMap<>();
6        HashSet<String> bannedSet = new HashSet<>();
7        for(String b : banned) {
8            bannedSet.add(b);
9        }
10        for(String word : words) {
11            if(!bannedSet.contains(word)) {
12                map.put(word, map.getOrDefault(word, 0) + 1);
13            }
14        }
15        String ans = "";
16        int max = 0;
17        for(Map.Entry<String, Integer> entry : map.entrySet()) {
18            if(entry.getValue() > max) {
19                max = entry.getValue();
20                ans = entry.getKey();
21            }
22        }
23        
24        return ans;
25    }
26}