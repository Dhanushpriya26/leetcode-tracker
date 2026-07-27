// Last updated: 7/27/2026, 6:23:52 PM
1class Solution {
2    public List<List<Integer>> threeSum(int[] nums) {
3        Arrays.sort(nums);
4        List<List<Integer>> res = new ArrayList<>();
5        for (int i = 0; i < nums.length-2; i++) {
6            if (i > 0 && nums[i] == nums[i - 1]) {
7                continue;
8            } else {
9                int left = i + 1;
10                int right = nums.length - 1;
11                while (left < right) {
12                    int sum = nums[i] + nums[left] + nums[right];
13                    if (sum > 0) {
14                       right--;  
15                    } else if (sum < 0) {
16                       left++;
17                    } else {
18                        res.add(Arrays.asList(nums[i],nums[left],nums[right]));
19                        do {left++;} while ( left < right && nums[left] == nums[left-1]);
20                        do {right--;} while (right > left && nums[right]==nums[right+1]); 
21                    }
22                }
23            }
24        }
25        return res;
26    }
27}