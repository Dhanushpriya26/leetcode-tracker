// Last updated: 7/9/2026, 9:16:24 AM
class Solution {
    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] result = new ListNode[k];
        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }
        int size = len / k;
        int extra = len % k;
        temp = head;
        for (int i = 0; i < k; i++) {
            if (temp == null) {
                result[i] = null;
                continue;
            }
            result[i] = temp;
            int currentSize = size + (extra > 0 ? 1 : 0);
            extra--;
            for (int j = 1; j < currentSize; j++) {
                temp = temp.next;
            }
            ListNode nextPart = temp.next;
            temp.next = null;
            temp = nextPart;
        }
        return result;
    }
}