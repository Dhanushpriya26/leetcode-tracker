// Last updated: 7/9/2026, 9:13:32 AM
class Solution {
    public boolean checkGoodInteger(int n) {
        int digitSum=0;
        int squareSum=0;
        while(n>0){
            int d=n%10;
            digitSum+=d;
            squareSum+=d*d;
            n/=10;
        }
        return(squareSum-digitSum)>=50;
    }
}