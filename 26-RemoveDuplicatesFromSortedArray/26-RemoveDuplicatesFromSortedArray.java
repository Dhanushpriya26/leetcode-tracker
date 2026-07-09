// Last updated: 7/9/2026, 9:36:58 AM
class Solution {
    public int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;

        int j = 0;

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[j]) {
                j++;
                nums[j] = nums[i];
            }
        }

        return j + 1;
    }
} 