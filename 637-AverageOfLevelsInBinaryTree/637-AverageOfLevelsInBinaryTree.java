// Last updated: 7/9/2026, 9:16:40 AM
class Solution 
{
    public List<Double> averageOfLevels(TreeNode root)
     {
        List<Double> ans=new ArrayList<>();
        Queue<TreeNode> q= new LinkedList<>();
        if(root == null) return ans;
        q.add(root);
        while(!q.isEmpty())
        {
            double sum= 0;
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
            ans.add(sum/len);
        }
        return ans;
    }
}