// Last updated: 7/9/2026, 9:13:29 AM
class Solution {
    public int maxDigitRange(int[] nums) {
        int maxRange=-1;
        int sum=0;
        for(int num:nums){
            int temp=num;
            int lar=0;
            int small=9;
            while(temp>0){
                int digit=temp%10;
                if(digit>lar)
                    lar=digit;
                if(digit<small)
                    small=digit;
                temp/=10;
            }
            int range=lar-small;
            if(range>maxRange){
                maxRange=range;
                sum=num;
            }else if(range==maxRange){
                sum+=num;
            }
        }
        return sum;
    }
}