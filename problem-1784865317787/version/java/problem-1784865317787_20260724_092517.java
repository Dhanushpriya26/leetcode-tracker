// Last updated: 7/24/2026, 9:25:17 AM
1class Solution {
2
3    public int uniqueXorTriplets(int[] nums) {
4        int m = 0;
5        for (int v : nums) {
6            m = Math.max(m, v);
7        }
8        int u = 1;
9        while (u <= m) {
10            u <<= 1;
11        }
12        boolean[] one = new boolean[u];
13        boolean[] two = new boolean[u];
14        boolean[] three = new boolean[u];
15        for (int v : nums) {
16            one[v] = true;
17            for (int x = 0; x < u; x++) {
18                if (one[x]) {
19                    two[x ^ v] = true;
20                }
21            }
22        }
23        for (int v : nums) {
24            for (int x = 0; x < u; x++) {
25                if (two[x]) {
26                    three[x ^ v] = true;
27                }
28            }
29        }
30        int ans = 0;
31        for (boolean b : three) {
32            if (b) {
33                ans++;
34            }
35        }
36        return ans;
37    }
38}