// Last updated: 9/24/2026, 9:12:49 PM
1class Solution {
2    public List<List<String>> findLadders(String beginWord, String endWord, List<String> wordList) {
3        List<List<String>> ans = new ArrayList<>(); 
4        Map<String, Set<String>> reverse = new HashMap<>(); 
5        Set<String> wordSet = new HashSet<>(wordList); 
6        wordSet.remove(beginWord);
7        Queue<String> queue = new LinkedList<>(); 
8        queue.add(beginWord); 
9        Set<String> nextLevel = new HashSet<>(); 
10        boolean findEnd = false; 
11        while (!queue.isEmpty()) { 
12            String word = queue.remove();
13            for (String next : wordSet) {
14                if (isLadder(word, next)) {
15                    Set<String> reverseLadders = reverse.computeIfAbsent(next, k -> new HashSet<>());
16                    reverseLadders.add(word); 
17                    if (endWord.equals(next)) {
18                        findEnd = true;
19                    }
20                    nextLevel.add(next); 
21                }
22            }
23            if (queue.isEmpty()) { 
24                if (findEnd) break; 
25                queue.addAll(nextLevel); 
26                wordSet.removeAll(nextLevel); 
27                nextLevel.clear();
28            }
29        }
30        if (!findEnd) return ans; // if can't reach endWord from startWord, then return ans.
31        Set<String> path = new LinkedHashSet<>();
32        path.add(endWord);
33		// traverse reverse graph from endWord to beginWord
34        findPath(endWord, beginWord, reverse, ans, path); 
35        return ans;
36    }
37
38
39    private void findPath(String endWord, String beginWord, Map<String, Set<String>> graph,
40                                 List<List<String>> ans, Set<String> path) {
41        Set<String> next = graph.get(endWord);
42        if (next == null) return;
43        for (String word : next) {
44            path.add(word);
45            if (beginWord.equals(word)) {
46                List<String> shortestPath = new ArrayList<>(path);
47                Collections.reverse(shortestPath); // reverse words in shortest path
48                ans.add(shortestPath); // add the shortest path to ans.
49            } else {
50                findPath(word, beginWord, graph, ans, path);
51            }
52            path.remove(word);
53        }
54    }
55
56    private boolean isLadder(String s, String t) {
57        if (s.length() != t.length()) return false;
58        int diffCount = 0;
59        int n = s.length();
60        for (int i = 0; i < n; i++) {
61            if (s.charAt(i) != t.charAt(i)) diffCount++;
62            if (diffCount > 1) return false;
63        }
64        return diffCount == 1;
65    }
66}