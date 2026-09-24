// Last updated: 9/24/2026, 9:10:42 PM
1class Solution {
2    int ans = Integer.MIN_VALUE;
3    
4    public int maxPathSum(TreeNode root) {
5        helper(root);
6        return ans;
7    }
8
9    int helper(TreeNode node) {
10        if (node == null) return 0;
11        int left = Math.max(helper(node.left), 0);
12        int right = Math.max(helper(node.right), 0);
13        int pathSum = node.val + left + right;
14    
15        ans = Math.max(ans, pathSum);
16        return node.val + Math.max(left, right);
17    }
18}