// Last updated: 7/16/2026, 9:19:34 AM
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
12public void addNum(int num) {
13    if (even) {
14        large.offer(num);
15        small.offer(large.poll());
16    } else {
17        small.offer(num);
18        large.offer(small.poll());
19    }
20    even = !even;
21        }
22    }