// Last updated: 7/9/2026, 9:14:32 AM
/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        ListNode modify=head.next;
        ListNode nextSum=modify;
        while(nextSum!=null){
            int sum=0;
            while(nextSum.val!=0){
                sum+=nextSum.val;
                nextSum=nextSum.next;
            }
            modify.val=sum;
            nextSum=nextSum.next;
            modify.next=nextSum;
            modify=modify.next;
        }
        return head.next;
    }
}