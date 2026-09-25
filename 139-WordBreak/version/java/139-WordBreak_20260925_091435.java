// Last updated: 9/25/2026, 9:14:35 AM
1class Solution {
2    public List<String> wordBreak(String s, List<String> wordDict) {
3        HashSet<String> hs = new HashSet<>(wordDict);
4        return wordBreakHelper(s, 0, hs);
5    }
6
7    private List<String> wordBreakHelper(String s, int start, HashSet<String> dict) {
8        List<String> validSubstr = new ArrayList<>();
9
10        if (start == s.length())
11            validSubstr.add("");
12        for (int end = start + 1; end <= s.length(); end++) {
13            String prefix = s.substring(start, end);
14            if (dict.contains(prefix)) {
15                List<String> suffixes = wordBreakHelper(s, end, dict);
16                for (String suffix : suffixes) {
17                    validSubstr.add(prefix + (suffix.equals("") ? "" : " ") + suffix);
18                }
19            }
20        }
21        return validSubstr;
22    }
23}