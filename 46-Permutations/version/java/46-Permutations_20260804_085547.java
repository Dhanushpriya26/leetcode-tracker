// Last updated: 8/4/2026, 8:55:47 AM
1class Solution {
2    public List<List<Integer>> permute(int[] nums) {
3        List<List<Integer>> res = new ArrayList<>();
4        permuteHelper(nums, 0, res);
5        return res;
6    }
7    private void permuteHelper(int[] nums, int i, List<List<Integer>> res) {
8        if (i == nums.length) {
9            List<Integer> permutation = new ArrayList<>();
10            for (int num : nums) permutation.add(num);
11            res.add(permutation);
12            return;
13        }
14        for (int j = i; j < nums.length; j++) {
15            swap(nums, i, j);
16            permuteHelper(nums, i + 1, res);
17            swap(nums, i, j);
18        }
19    }
20    private void swap(int[] nums, int i, int j) {
21        int tmp = nums[i];
22        nums[i] = nums[j];
23        nums[j] = tmp;
24    }
25}