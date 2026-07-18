// Last updated: 7/18/2026, 6:54:27 PM
1class Solution {
2    public List<String> readBinaryWatch(int turnedOn) {
3        List<String> result = new ArrayList<>();
4        for (int hour = 0; hour < 12; hour++) {
5            for (int minute = 0; minute < 60; minute++) {
6                int totalBits = Integer.bitCount(hour) + Integer.bitCount(minute);
7                if (totalBits == turnedOn) {
8                    String time = hour + ":" + 
9                                  (minute < 10 ? "0" + minute : minute);
10                    
11                    result.add(time);
12                }
13            }
14        }
15        return result;
16    }
17}