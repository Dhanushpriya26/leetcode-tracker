// Last updated: 8/6/2026, 9:32:24 AM
1class Solution {
2    public int numTrees(int n) {
3  int [] G = new int[n+1];
4  G[0] = G[1] = 1;
5    
6  for(int i=2; i<=n; ++i) {
7    for(int j=1; j<=i; ++j) {
8      G[i] += G[j-1] * G[i-j];
9    }
10  }
11  return G[n];
12}
13}