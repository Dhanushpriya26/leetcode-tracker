// Last updated: 9/7/2026, 10:33:21 AM
1class Solution {
2    public List<Integer> findSubstring(String s, String[] words) {
3        List<Integer> ans = new ArrayList<>();
4        if (words.length == 0 || s.length() == 0) {
5            return ans;
6        }
7        int wordSize = words[0].length();
8        int wordCount = words.length;
9        int N = s.length();
10        HashMap<String,Integer> originalCount = new HashMap<>();
11        for(int i = 0; i<words.length; i++){
12            originalCount.put(words[i], originalCount.getOrDefault(words[i],0)+1);
13        }
14        for(int offset = 0; offset<wordSize; offset++){
15            HashMap<String,Integer> currentCount = new HashMap<>();
16            int start = offset;
17            int count = 0;
18            for(int end = offset; end + wordSize <= N; end += wordSize){
19                String currWord = s.substring(end, end + wordSize);
20                if(originalCount.containsKey(currWord)){
21                    currentCount.put(currWord, currentCount.getOrDefault(currWord,0)+1);
22                    count++;
23                    while(currentCount.get(currWord)>originalCount.get(currWord)){
24                        String startWord = s.substring(start,start+wordSize);
25                        currentCount.put(startWord, currentCount.get(startWord)-1);
26                        start+=wordSize;
27                        count--;                        
28                    }
29                    if(count == wordCount){
30                        ans.add(start);
31                    }
32                    
33                }
34                else{
35                    count = 0;
36                    start = end + wordSize;
37                    currentCount.clear();
38                }
39            }
40        }
41        return ans;
42    }
43}