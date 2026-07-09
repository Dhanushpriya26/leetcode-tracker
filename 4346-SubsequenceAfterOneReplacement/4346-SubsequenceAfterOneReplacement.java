// Last updated: 7/9/2026, 9:13:31 AM
class Solution {
    public boolean canMakeSubsequence(String s, String t) {
       int n=s.length(),m=t.length();
        if(n>m)return false;
        int[] pre=new int[n+1];
        int j=0;
        pre[0]=-1;
        for(int i=0;i<n;i++){
            while(j<m && s.charAt(i)!=t.charAt(j))j++;
            if(j==m){
                pre[i+1]=m;
            }else{
                pre[i+1]=j++;
            }
        }
        int[] suf=new int[n+1];
        j=m-1;
        suf[n]=m;
        for(int i=n-1;i>=0;i--){
            while(j>=0 && s.charAt(i)!=t.charAt(j))j--;
            if(j<0){
                suf[i]=-1;
            }else{
                suf[i]=j--;
            }
        }
        if(pre[n]!=m)return true;
        for(int i=0;i<n;i++){
            int left=pre[i];
            int right=suf[i+1];
            if(left<right-1)return true;
        }
        return false;
    }
}