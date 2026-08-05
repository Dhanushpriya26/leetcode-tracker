// Last updated: 8/5/2026, 8:27:49 PM
1class Solution {
2    public List<Integer> remainingMethods(int n, int k, int[][] invocations) {
3        List<Integer>[] adj = new ArrayList[n];
4        for (int i = 0; i < n; i++) {
5            adj[i] = new ArrayList<>();
6        }
7        for (int[] edge : invocations) {
8            int u = edge[0];
9            int v = edge[1];
10
11            adj[u].add(v);
12        }
13        boolean[] suspicious = new boolean[n];
14        suspicious[k] = true;
15        Queue<Integer> queue = new ArrayDeque<>();
16        queue.offer(k);
17        while (!queue.isEmpty()) {
18            int u = queue.poll();
19            for (int v : adj[u]) {
20                if (!suspicious[v]) {
21                    suspicious[v] = true;
22                    queue.offer(v);
23                }
24            }
25        }
26        for (int[] edge : invocations) {
27            int u = edge[0];
28            int v = edge[1];
29            if (!suspicious[u] && suspicious[v]) {
30                List<Integer> allMethods = new ArrayList<>();
31                for (int i = 0; i < n; i++) {
32                    allMethods.add(i);
33                }
34                return allMethods;
35            }
36        }
37        List<Integer> result = new ArrayList<>();
38        for (int i = 0; i < n; i++) {
39            if (!suspicious[i]) {
40                result.add(i);
41            }
42        }
43        return result;
44    }
45}