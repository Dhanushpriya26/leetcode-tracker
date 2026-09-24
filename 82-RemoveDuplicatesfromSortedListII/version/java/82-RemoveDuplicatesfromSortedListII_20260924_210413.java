// Last updated: 9/24/2026, 9:04:13 PM
1import java.util.*;
2
3class Solution {
4    private List<List<Integer>> result = new ArrayList<>();
5    private List<Integer> path = new ArrayList<>();
6
7    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
8        dfs(root, targetSum);
9        return result;
10    }
11
12    private void dfs(TreeNode node, int remaining) {
13        if (node == null) {
14            return;
15        }
16        path.add(node.val);
17        if (node.left == null && node.right == null) {
18            if (remaining == node.val) {
19                result.add(new ArrayList<>(path));
20            }
21        } else {
22            dfs(node.left, remaining - node.val);
23            dfs(node.right, remaining - node.val);
24        }
25
26        path.remove(path.size() - 1);
27    }
28}