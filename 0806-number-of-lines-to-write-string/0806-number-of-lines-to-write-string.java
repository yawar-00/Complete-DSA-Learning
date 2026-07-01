class Solution {
    public int[] numberOfLines(int[] widths, String s) {
        int pixels =0;
        int lines=0;
        for(int i=0;i<s.length();i++){
            char ch =s.charAt(i);
            int p =widths[ch-'a'];
            if(pixels+p>100){
                pixels=p;
                lines++;
            }
            else if(pixels+p==100){
                pixels=0;
                lines++;
            }
            else{
                pixels+=p;
            }
        }
        if(pixels==0){
            return new int[]{lines,100};
        }
        return new int[]{lines+1,pixels};
    }
}