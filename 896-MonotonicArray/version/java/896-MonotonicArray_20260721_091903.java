// Last updated: 7/21/2026, 9:19:03 AM
1class Solution {
2    public boolean isMonotonic(int[] nums) {
3        int n = nums.length;
4        if (n == 1)
5             return true;
6        boolean isInc = true;
7        boolean isDec = true;
8        for (int i = 1; i < n; i++) {
9            if (!isInc && !isDec) {
10                return false;
11            }
12            if (nums[i] < nums[i - 1]) {
13                isInc = false;
14            }
15            if (nums[i] > nums[i - 1]) {
16                isDec = false;
17            }
18        }
19        return isInc || isDec;        
20    }
21}