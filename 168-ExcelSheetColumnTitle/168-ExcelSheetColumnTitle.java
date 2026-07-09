// Last updated: 7/9/2026, 9:31:38 AM
class Solution {
    public String convertToTitle(int columnNumber) {
        StringBuilder res = new StringBuilder();

        while (columnNumber > 0) {
            columnNumber--;
            res.insert(0, (char) ((columnNumber % 26) + 'A'));
            columnNumber /= 26;
        }
        
        return res.toString();        
    }
}