class Solution {
    public String convertToTitle(int columnNumber) {
        String ans ="";
        while(columnNumber>0){
            columnNumber--;
            int r = columnNumber%26;
            columnNumber /=26;
            ans=(char)(65+r)+ans;
        }
        return ans;
    }
}