// Last updated: 7/27/2026, 7:52:44 PM
1class Solution {
2    public int threeSumClosest(int[] nums, int target) {
3        Arrays.sort(nums);
4        int n = nums.length;
5        int closest = nums[0] + nums[1] + nums[2];
6        for (int i = 0; i < n - 2; i++) {
7            int left = i + 1;
8            int right = n - 1;
9            while (left < right) {
10                int sum = nums[i] + nums[left] + nums[right];
11                if (Math.abs(sum - target) < Math.abs(closest - target)) {
12                    closest = sum;
13                }
14                if (sum < target) {
15                    left++;
16                } else if (sum > target) {
17                    right--;
18                } else {
19                    return sum;
20                }
21            }
22        }
23        return closest;
24    }
25}