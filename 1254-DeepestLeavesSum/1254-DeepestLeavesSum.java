// Last updated: 7/9/2026, 9:15:42 AM
class Solution {
    public int deepestLeavesSum(TreeNode root) {
        Queue<TreeNode> q= new LinkedList<>();
        if(root == null) return 0;
        q.add(root);
        int sum=0;
        while(!q.isEmpty())
        {
            sum=0;
            int len=q.size();
            for(int i=0;i<len;i++)
            {
                TreeNode temp=q.poll();
                sum+=temp.val;
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                q.add(temp.right);
            }
        }
        return sum;
    }
}
