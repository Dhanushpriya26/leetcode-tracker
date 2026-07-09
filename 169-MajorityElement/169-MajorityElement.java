// Last updated: 7/9/2026, 9:31:37 AM
class Solution {
    public int majorityElement(int[] nums) {
        int count=0;
        int c=0;
        for(int num:nums){
        if(count==0){
        c=num;
        }
        if(num==c){
        count++;
        }else{
        count--;
        }
    }
    return c;
}
    }