// Last updated: 7/9/2026, 9:16:10 AM
class Solution {
    Integer res = Integer.MAX_VALUE, pre = null;
    public int minDiffInBST(TreeNode root) {
        if (root.left != null) minDiffInBST(root.left);
        if (pre != null) res = Math.min(res, root.val - pre);
        pre = root.val;
        if (root.right != null) minDiffInBST(root.right);
        return res;
    }
}