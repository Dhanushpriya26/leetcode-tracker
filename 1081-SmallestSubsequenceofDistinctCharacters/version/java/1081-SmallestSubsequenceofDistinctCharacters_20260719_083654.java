// Last updated: 7/19/2026, 8:36:54 AM
1class Solution {
2    public String smallestSubsequence(String s) {
3        int[] freq = new int[27];
4        boolean[] seen = new boolean[27];
5        Stack<Character> stack = new Stack<>();
6
7        for (int i = 0; i < s.length(); i++)
8            freq[s.charAt(i) & 31]++;
9
10        for (int i = 0; i < s.length(); i++) {
11            char c = s.charAt(i);
12            int x = c & 31;
13            freq[x]--;
14
15            if (seen[x])
16                continue;
17
18            while (!stack.isEmpty()) {
19                if (stack.peek() <= c)
20                    break;
21
22                if (freq[stack.peek() & 31] == 0)
23                    break;
24
25                seen[stack.peek() & 31] = false;
26                stack.pop();
27            }
28
29            stack.push(c);
30            seen[x] = true;
31        }
32
33        StringBuilder res = new StringBuilder();
34
35        for (char c : stack)
36            res.append(c);
37
38        return res.toString();
39    }
40}