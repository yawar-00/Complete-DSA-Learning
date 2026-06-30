class Solution {
    public boolean checkRecord(String s) {
        int abs =0;
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch =='A'){
                abs++;
            }
            else if(i+2<s.length()&&ch=='L'){
                if(s.charAt(i+1)=='L'&&s.charAt(i+2)=='L'){
                    return false;
                }
            }
            if(abs>1){
                return false;
            }
        }
        return true;
    }
}