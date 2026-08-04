// Last updated: 8/4/2026, 8:52:55 AM
1class Solution {
2    public List<Integer> findMissingElements(int[] nums) {
3        List<Integer> ans = new ArrayList<>();
4        Arrays.sort(nums);
5        int smallest = nums[0];
6        int largest = nums[nums.length - 1];
7        for (int i = smallest; i <= largest; i++) {
8            ans.add(i);
9        }
10        for (int i = 0; i < nums.length; i++) {
11            if (ans.contains(nums[i])) {
12                ans.remove(Integer.valueOf(nums[i]));
13            }
14        }
15        return ans;
16    }
17}