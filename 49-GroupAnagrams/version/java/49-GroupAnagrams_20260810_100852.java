// Last updated: 8/10/2026, 10:08:52 AM
1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        Map<String, List<String>> map = new HashMap<>();
4        for (String word : strs) {
5            char[] chars = word.toCharArray();
6            Arrays.sort(chars);
7            String sortedWord = new String(chars);
8            if (!map.containsKey(sortedWord)) {
9                map.put(sortedWord, new ArrayList<>());
10            }
11            map.get(sortedWord).add(word);
12        }
13        return new ArrayList<>(map.values());
14    }
15}