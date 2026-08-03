// Last updated: 8/3/2026, 9:01:14 AM
1class Solution {
2    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
3        Arrays.sort(candidates);
4        List<List<Integer>> res = new ArrayList<>();
5        dfs(candidates, target, 0, new ArrayList<Integer>(), res);
6        return res;
7    }
8    private void dfs(int[] candidates, int target, int start, List<Integer> comb, List<List<Integer>> res) {
9        if (target < 0) {
10            return;
11        }
12        if (target == 0) {
13            res.add(new ArrayList<Integer>(comb));
14            return;
15        }
16        for (int i = start; i < candidates.length; i++) {
17            if (i > start && candidates[i] == candidates[i-1]) {
18                continue;
19            }
20            if (candidates[i] > target) {
21                break;
22            }
23            comb.add(candidates[i]);
24            dfs(candidates, target - candidates[i], i + 1, comb, res);
25            comb.remove(comb.size() - 1);
26        }
27    }
28}