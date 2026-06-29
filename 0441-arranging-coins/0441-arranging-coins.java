class Solution {
    public int arrangeCoins(int n) {
        int i=1;
        while(n>=i){
            n-=i;
            i++;
        }
        if(n>=0){
            return i-1;
        }
        return i;

    }
}