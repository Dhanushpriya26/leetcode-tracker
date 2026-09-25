// Last updated: 9/25/2026, 9:06:47 AM
1class Solution {
2    public Node copyRandomList(Node head) {
3        Map<Node, Node> hashMap = new HashMap<>();
4        Node cur = head;
5
6        while (cur != null) {
7            hashMap.put(cur, new Node(cur.val));
8            cur = cur.next;
9        }
10
11        cur = head;
12
13        while (cur != null) {
14            Node copy = hashMap.get(cur);
15            copy.next = hashMap.get(cur.next);
16            copy.random = hashMap.get(cur.random);
17            cur = cur.next;
18        }
19
20        return hashMap.get(head);        
21    }
22}