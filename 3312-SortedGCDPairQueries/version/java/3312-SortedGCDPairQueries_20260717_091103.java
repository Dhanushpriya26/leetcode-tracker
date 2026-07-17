// Last updated: 7/17/2026, 9:11:03 AM
1class Solution {
2    public int[] gcdValues(int[] nums, long[] queries) {
3        int maxVal = 0;
4        for (int x : nums) maxVal = Math.max(maxVal, x);
5        long[] freq = new long[maxVal + 1];
6        for (int x : nums) freq[x]++;
7        long[] divCnt = new long[maxVal + 1];
8        for (int g = 1; g <= maxVal; g++) {
9            for (int x = g; x <= maxVal; x += g) {
10                divCnt[g] += freq[x];
11            }
12        }
13        long[] exact = new long[maxVal + 1];
14        for (int g = maxVal; g >= 1; g--) {
15            exact[g] = divCnt[g] * (divCnt[g] - 1) / 2;
16            for (int m = 2 * g; m <= maxVal; m += g) {
17                exact[g] -= exact[m];
18            }
19        }
20        long[] prefix = new long[maxVal + 1];
21        for (int g = 1; g <= maxVal; g++) {
22            prefix[g] = prefix[g - 1] + exact[g];
23        }
24        int[] ans = new int[queries.length];
25        for (int i = 0; i < queries.length; i++) {
26            long target = queries[i] + 1;
27            int left = 1, right = maxVal;
28            while (left < right) {
29                int mid = left + (right - left) / 2;
30
31                if (prefix[mid] >= target)
32                    right = mid;
33                else
34                    left = mid + 1;
35            }
36
37            ans[i] = left;
38        }
39        return ans;
40    }
41}