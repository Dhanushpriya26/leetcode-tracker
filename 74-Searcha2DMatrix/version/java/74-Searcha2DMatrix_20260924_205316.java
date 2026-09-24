// Last updated: 9/24/2026, 8:53:16 PM
1/**
2 * Definition for singly-linked list.
3 * public class ListNode {
4 *     int val;
5 *     ListNode next;
6 *     ListNode() {}
7 *     ListNode(int val) { this.val = val; }
8 *     ListNode(int val, ListNode next) {
9 *         this.val = val;
10 *         this.next = next;
11 *     }
12 * }
13 */
14
15class Solution {
16    public ListNode deleteDuplicates(ListNode head) {
17        ListNode dummy = new ListNode(0);
18        dummy.next = head;
19
20        ListNode prev = dummy;
21        ListNode curr = head;
22
23        while (curr != null) {
24            if (curr.next != null && curr.val == curr.next.val) {
25                int duplicateValue = curr.val;
26                while (curr != null && curr.val == duplicateValue) {
27                    curr = curr.next;
28                }
29                prev.next = curr;
30            } else {
31                prev = curr;
32                curr = curr.next;
33            }
34        }
35
36        return dummy.next;
37    }
38}