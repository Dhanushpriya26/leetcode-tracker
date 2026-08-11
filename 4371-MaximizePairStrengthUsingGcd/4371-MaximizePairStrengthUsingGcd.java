// Last updated: 8/11/2026, 8:31:46 PM
class Solution {
    public long maxPairStrength(int[] nums) {
        long ans=0;
        for(int i=0;i<nums.length;i++){
            for(int j=i+1;j<nums.length;j++){
                long g=gcd(nums[i],nums[j]);
                long s=(1L*nums[i]*nums[j])/(g*g);
                ans=Math.max(ans,s);
            }
        }
        return ans;
    }
    private long gcd(long a,long b){
        while(b!=0){
            long temp=a%b;
            a=b;
            b=temp;
        }
        return a;
    }
}