// Last updated: 7/9/2026, 9:16:09 AM
class Solution {
    public int numComponents(ListNode head, int[] G) {
        Set<Integer> Gset = new HashSet();
        for (int x: G) Gset.add(x);
        ListNode cur = head;
        int ans = 0;
        while (cur != null) {
            if (Gset.contains(cur.val) &&
                    (cur.next == null || !Gset.contains(cur.next.val)))
                ans++;
            cur = cur.next;
        }
        return ans;
    }
}