// Last updated: 8/11/2026, 8:24:43 PM
1class Solution {
2    public int missingInteger(int[] A) {
3        int n = A.length;
4        Set<Integer> seen = new HashSet<>(n);
5        for (int num : A)
6            seen.add(num);
7        int sum = A[0];
8        for (int i = 1; i < n; i++) {
9            if (A[i] == A[i - 1] + 1)
10                sum += A[i];
11            else break;
12        }
13        while (seen.contains(sum))
14            sum++;
15
16        return sum;
17    }
18}