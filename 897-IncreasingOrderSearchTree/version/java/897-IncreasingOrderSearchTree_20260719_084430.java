// Last updated: 7/19/2026, 8:44:30 AM
1class Solution {
2    TreeNode newNode = null;
3    TreeNode prev = null;
4
5    public TreeNode increasingBST(TreeNode root) {
6        inorder(root);
7        return newNode;
8    }
9
10    public void inorder(TreeNode root) {
11        if (root == null) return;
12
13        inorder(root.left);
14
15        if (newNode == null) {
16            newNode = root;
17        }
18
19        root.left = null;
20
21        if (prev != null) {
22            prev.right = root;
23        }
24
25        prev = root;
26
27        inorder(root.right);
28    }
29}