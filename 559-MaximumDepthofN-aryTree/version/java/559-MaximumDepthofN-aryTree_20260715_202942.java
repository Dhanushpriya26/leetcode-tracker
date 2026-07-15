// Last updated: 7/15/2026, 8:29:42 PM
1class Solution {
2    public int maxDepth(Node root) {
3        if (root == null)
4            return 0;
5        int maxx = 1;
6        for (Node child : root.children)
7            maxx = Math.max(maxx, 1 + maxDepth(child));
8        return maxx;
9    }
10}