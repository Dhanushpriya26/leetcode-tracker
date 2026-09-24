// Last updated: 9/24/2026, 9:03:15 PM
1class Solution {
2    public boolean hasPathSum(TreeNode root, int targetSum) {
3        if (root == null) {
4            return false;
5        }
6        targetSum -= root.val;
7        if (root.left == null && root.right == null) {
8            return targetSum == 0;
9        }
10        return hasPathSum(root.left, targetSum)
11                || hasPathSum(root.right, targetSum);
12    }
13}