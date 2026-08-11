// Last updated: 8/11/2026, 8:38:17 PM
class Solution {
    public int largestPerimeter(int[] nums) {
        Arrays.sort(nums);
        for(int i = nums.length-1; i>1; i--){ 
           if(nums[i] < nums[i-1] + nums[i-2])
               return  nums[i] + nums[i-1]+ nums[i-2];   
        }
        return 0;
    }
}