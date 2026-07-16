// Last updated: 7/16/2026, 9:23:03 AM
1class MedianFinder {
2private PriorityQueue<Integer> small = new PriorityQueue<>(Collections.reverseOrder());
3private PriorityQueue<Integer> large = new PriorityQueue<>();
4private boolean even = true;
5
6public double findMedian() {
7    if (even)
8        return (small.peek() + large.peek()) / 2.0;
9    else
10        return small.peek();
11}
12
13public void addNum(int num) {
14    if (even) {
15        large.offer(num);
16        small.offer(large.poll());
17    } else {
18        small.offer(num);
19        large.offer(small.poll());
20    }
21    even = !even;
22        }
23    }