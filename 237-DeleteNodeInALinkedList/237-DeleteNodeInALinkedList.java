// Last updated: 7/9/2026, 9:18:14 AM
class Solution {
    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }
}