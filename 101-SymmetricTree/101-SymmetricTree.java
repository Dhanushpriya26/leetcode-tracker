// Last updated: 7/9/2026, 9:36:18 AM
class Solution {
    public boolean isSymmetric(TreeNode root) {
        if(root == null)return true;
        return test(root.left,root.right);
    }
    public boolean test(TreeNode p, TreeNode q){
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null|| p.val!=q.val){
            return false;
        }
       return test(p.left,q.right) && test(p.right,q.left);
    }
}