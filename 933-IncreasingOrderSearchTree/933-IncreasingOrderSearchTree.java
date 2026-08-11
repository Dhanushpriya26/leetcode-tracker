// Last updated: 8/11/2026, 8:38:46 PM
class Solution {
    TreeNode newNode = null;
    TreeNode prev = null;

    public TreeNode increasingBST(TreeNode root) {
        inorder(root);
        return newNode;
    }

    public void inorder(TreeNode root) {
        if (root == null) return;

        inorder(root.left);

        if (newNode == null) {
            newNode = root;
        }

        root.left = null;

        if (prev != null) {
            prev.right = root;
        }

        prev = root;

        inorder(root.right);
    }
}