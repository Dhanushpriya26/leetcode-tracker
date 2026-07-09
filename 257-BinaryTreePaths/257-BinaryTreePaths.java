// Last updated: 7/9/2026, 9:18:10 AM
class Solution {
    private void fun(TreeNode node, StringBuilder sb, List<String> res){
        int len = sb.length(); 
        sb.append(node.val);
        if(node.left==null && node.right==null) {
            res.add(sb.toString());
            sb.setLength(len); 
            return;
        }
        sb.append("->");
        if(node.left!=null) fun(node.left, sb, res);
        if(node.right!=null) fun(node.right, sb, res);
        
        sb.setLength(len); 
    }
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> res = new ArrayList<>();
        if(root==null) return res;
        fun(root, new StringBuilder(), res);
        return res;
    }
}