// Last updated: 7/21/2026, 9:30:06 AM
class Solution {
    public boolean canReach(int[] start, int[] target) {
        int startColor=(start[0]+start[1])%2;
        int targetColor=(target[0]+target[1])%2;
        return startColor==targetColor;
    }
}