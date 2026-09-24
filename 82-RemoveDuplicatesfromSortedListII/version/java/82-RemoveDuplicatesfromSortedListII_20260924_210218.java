// Last updated: 9/24/2026, 9:02:18 PM
1class Solution {
2    public boolean isBalanced(TreeNode root) {
3        int[] result = dfs(root);
4        return result[0] == 1;        
5    }
6
7    private int[] dfs(TreeNode node) {
8        if (node == null) return new int[]{1, 0}; 
9        int[] left = dfs(node.left);
10        int[] right = dfs(node.right);
11        
12        boolean isBalanced = left[0] == 1 && right[0] == 1 && Math.abs(left[1] - right[1]) <= 1;
13        
14        return new int[]{isBalanced ? 1 : 0, 1 + Math.max(left[1], right[1])};
15    }    
16}