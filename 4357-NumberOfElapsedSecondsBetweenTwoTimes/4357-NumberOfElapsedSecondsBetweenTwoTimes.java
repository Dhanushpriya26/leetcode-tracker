// Last updated: 7/16/2026, 9:13:05 AM
class Solution {
    public int secondsBetweenTimes(String startTime, String endTime) {
        return toSeconds(endTime)-toSeconds(startTime);
    }
    private int toSeconds(String time){
        String[] t=time.split(":");
        int h=Integer.parseInt(t[0]);
        int m=Integer.parseInt(t[1]);
        int s=Integer.parseInt(t[2]);
        return h*3600+m*60+s;
    }
}