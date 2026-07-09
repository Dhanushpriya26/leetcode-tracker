// Last updated: 7/9/2026, 9:36:19 AM
class Solution {
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if(p==null && q==null){
            return true;
        }
        if(p==null || q==null|| p.val!=q.val){
            return false;
        }
       return isSameTree(p.left,q.left) && isSameTree(p.right,q.right);
    }
}