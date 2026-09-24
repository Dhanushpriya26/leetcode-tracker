// Last updated: 9/24/2026, 8:51:22 PM
1class Solution {
2    public boolean search(int[] nums, int target) {
3        int left = 0;
4        int right = nums.length - 1;
5        while (left <= right) {
6            int mid = (left + right) / 2;
7            if (nums[mid] == target) {
8                return true;
9            }
10            if (nums[mid] == nums[left]) {
11                left++;
12                continue;
13            }
14            if (nums[left] <= nums[mid]) {
15                if (nums[left] <= target && target < nums[mid]) {
16                    right = mid - 1;
17                } else {
18                    left = mid + 1;
19                }
20            } else {
21                if (nums[mid] < target && target <= nums[right]) {
22                    left = mid + 1;
23                } else {
24                    right = mid - 1;
25                }
26            }
27        }
28        
29        return false;        
30    }
31}