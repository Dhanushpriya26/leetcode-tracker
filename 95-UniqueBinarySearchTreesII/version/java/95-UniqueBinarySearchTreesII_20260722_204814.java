// Last updated: 7/22/2026, 8:48:14 PM
1class Solution {
2    public List<TreeNode> generateTrees(int n) {
3        return n > 0 ? generate_trees(1, n) : new ArrayList<>();
4    }
5    private List<TreeNode> generate_trees(int start, int end) {
6        List<TreeNode> all_trees = new ArrayList<>();
7        if (start > end) {
8            all_trees.add(null);
9            return all_trees;
10        }
11        for (int i = start; i <= end; i++) {
12            List<TreeNode> left_trees = generate_trees(start, i - 1);
13            List<TreeNode> right_trees = generate_trees(i + 1, end);
14            for (TreeNode l : left_trees) {
15                for (TreeNode r : right_trees) {
16                    TreeNode current_tree = new TreeNode(i);
17                    current_tree.left = l;
18                    current_tree.right = r;
19                    all_trees.add(current_tree);
20                }
21            }
22        }
23        return all_trees;
24    }
25}