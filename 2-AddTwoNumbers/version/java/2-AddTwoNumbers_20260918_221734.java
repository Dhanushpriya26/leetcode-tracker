// Last updated: 9/18/2026, 10:17:34 PM
1
2class Solution{
3    public ListNode addTwoNumbers(ListNode l1, ListNode l2){
4        ListNode dummy=new ListNode();
5        ListNode cur=dummy;
6        int carry=0;
7        while(l1 !=null || l2!=null || carry!=0){
8            int sum=carry;
9            if(l1!=null){
10                sum+=l1.val;
11                l1=l1.next;
12            }
13            if(l2!=null){
14                sum+=l2.val;
15                l2=l2.next;
16            }
17            carry=sum/10;
18            cur.next= new ListNode(sum%10);
19            cur=cur.next;
20
21        }
22        return dummy.next;
23    }
24}