// Last updated: 7/9/2026, 9:32:07 AM
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> ans=new ArrayList<>();
        Queue<TreeNode> q= new LinkedList<>();
        if(root == null) return ans;
        q.add(root);
        while(!q.isEmpty())
        {
            int len=q.size();
            List<Integer> res=new ArrayList<>();
            while(len-->0)
            {
                TreeNode temp=q.poll();
                if(temp.left!=null)
                    q.add(temp.left);
                if(temp.right!=null)
                q.add(temp.right);
            res.add(temp.val);
            }
            ans.add(res);
        }
        return ans;
    }
}