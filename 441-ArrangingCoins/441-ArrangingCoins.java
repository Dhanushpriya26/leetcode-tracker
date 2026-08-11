// Last updated: 8/11/2026, 8:43:36 PM
class Solution {
    public int arrangeCoins(int n) {
        int ans=0,index=1;
        while(n>=index){
            ans++;
            n-=index;
            index++;
        }
        return ans;
    }
}