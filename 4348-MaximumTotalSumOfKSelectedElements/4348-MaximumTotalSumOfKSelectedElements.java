// Last updated: 7/9/2026, 9:13:28 AM
class Solution {
    public long maxSum(int[] nums, int k, int mul) {
        Arrays.sort(nums);
        long ans=0;
        int n=nums.length;
        List<Integer>coeff=new ArrayList<>();
        for(int m=mul;m>=mul-k+1;m--){
            coeff.add(Math.max(1,m));
        }
        Collections.sort(coeff);
        for(int i=0;i<k;i++){
            ans+=1L*nums[n-k+i]*coeff.get(i);
        }
        return ans;
    }
}