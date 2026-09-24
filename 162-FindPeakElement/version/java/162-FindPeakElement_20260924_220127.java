// Last updated: 9/24/2026, 10:01:27 PM
1class Solution {
2    public int findPeakElement(int[] nums) {
3        int left = 0;
4        int right = nums.length - 1;
5
6        while (left < right) {
7            int mid = (left + right) / 2;
8            if (nums[mid] > nums[mid + 1]) {
9                right = mid;
10            } else {
11                left = mid + 1;
12            }
13        }
14
15        return left;        
16    }
17}