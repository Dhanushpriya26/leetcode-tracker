// Last updated: 7/9/2026, 9:17:06 AM
class Solution {
    TreeNode pre = null;
    int min = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        if (root == null) return 0;
        inOrder(root);
        return min;
    }

    private void inOrder(TreeNode root) {
        if (root == null) return;
        inOrder(root.left);
        if (pre != null) {
            min = Math.min(min, Math.abs(pre.val - root.val));
        }
        pre = root;
        inOrder(root.right);
    }
}