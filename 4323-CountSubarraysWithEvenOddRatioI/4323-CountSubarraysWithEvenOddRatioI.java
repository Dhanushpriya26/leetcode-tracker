// Last updated: 8/11/2026, 8:32:18 PM
class Solution {
    public int countRatioSubarrays(int[] nums, int a, int b) {
        int[] nor=nums;
        int n=nor.length;
        int ans=0;
        for(int i=0;i<n;i++){
            int even=0;
            int odd=0;
            for(int j=i;j<n;j++){
                if(nor[j]%2==0)
                    even++;
                else
                    odd++;
                if(odd>0&&(long)even*b<=(long)odd*a){
                    ans++;
                }
            }
        }
        return ans;
    }
}