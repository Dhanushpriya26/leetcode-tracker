// Last updated: 7/21/2026, 9:28:57 AM
1class Solution {
2    public List<Integer> postorder(Node root) {
3        ArrayList<Integer> list = new ArrayList<>();
4        if(root==null){
5            return list; 
6        }
7        help(list,root);
8        list.add(root.val);
9        return list;
10    }
11    public void help(ArrayList<Integer> list,Node root){
12        List<Node> li = new ArrayList<>();
13        li = root.children;
14        for(int i=0;i<li.size();i++){
15            if(li.get(i)==null){
16                continue;
17            }
18            help(list,li.get(i));
19            list.add(li.get(i).val);
20        }
21    }
22}