// Last updated: 7/9/2026, 9:14:24 AM
class Solution {
    public boolean checkTree(TreeNode root) {
       return root.left.val + root.right.val == root.val;
    }
}