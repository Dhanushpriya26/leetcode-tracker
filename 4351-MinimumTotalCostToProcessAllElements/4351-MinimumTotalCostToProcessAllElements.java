// Last updated: 7/16/2026, 9:13:06 AM
class Solution {
    public int minimumCost(int[] nums, int k) {
        long MOD=1000000007L;
        long resource=k;
        long ops=0;
        long ans=0;
        for(int x:nums){
            if(resource<x){
                long need=(x-resource+k-1L)/k;
                long first=ops+1;
                long last=ops+need;
                if((need&1)==0){
                    ans=(ans+((need/2)%MOD)*((first+last)%MOD))%MOD;
                }else{
                    ans=(ans+(need%MOD)*(((first+last)/2)%MOD))%MOD;
                }
                ops+=need;
                resource+=need*(long)k;
            }
            resource-=x;
        }
        return(int)ans;
    }
}