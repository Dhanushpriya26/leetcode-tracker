// Last updated: 7/16/2026, 9:14:32 AM
class Solution {
    public int repeatedNTimes(int[] nums) {
        int n = nums.length - 1;
        if(nums[0] == nums[n]) 
        return nums[0];
        for(int i = 0; i < n; i++) {
            if(nums[i] == nums[i + 1] || nums[i] == nums[i + 2]) return nums[i];
        }
        return nums[0];
    }
}