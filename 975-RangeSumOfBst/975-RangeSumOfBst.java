// Last updated: 7/9/2026, 9:16:02 AM

class Solution {
    public int rangeSumBST(TreeNode root, int low, int high) {
        if(root==null){
            return 0;
        }
        int cval=(root.val>=low&&root.val<=high) ? root.val :0;
        int leftSum=rangeSumBST(root.left,low,high);
        int rightSum=rangeSumBST(root.right,low,high);
        return cval+leftSum+rightSum;
    }
}