// Last updated: 7/9/2026, 9:15:28 AM
class Solution{
    public int getDecimalValue(ListNode head){
        int result=0;
        ListNode temp=head;
        while(temp!=null){
            result=result*2+temp.val;
            temp=temp.next;
        }
        return result;
    }
}