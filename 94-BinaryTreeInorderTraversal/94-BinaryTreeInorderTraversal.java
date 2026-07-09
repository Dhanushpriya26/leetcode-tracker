// Last updated: 7/9/2026, 9:36:21 AM
class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res=new ArrayList<>();
        inorder(root,res);
        return res;
    }
    private void inorder(TreeNode root, List<Integer> res){
        if(root==null)
            return;
        inorder(root.left,res);
        res.add(root.val);
        inorder(root.right,res);
    }
}