// Last updated: 8/11/2026, 8:32:31 PM
class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> ans = new ArrayList<>();
        Arrays.sort(nums);
        int smallest = nums[0];
        int largest = nums[nums.length - 1];
        for (int i = smallest; i <= largest; i++) {
            ans.add(i);
        }
        for (int i = 0; i < nums.length; i++) {
            if (ans.contains(nums[i])) {
                ans.remove(Integer.valueOf(nums[i]));
            }
        }
        return ans;
    }
}