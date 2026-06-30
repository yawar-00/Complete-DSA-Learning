class Solution {
    public String reverseStr(String s, int k) {
        if(k==1){
            return s;
        }
        int i=0,j=k-1;
        boolean rev=true;
        StringBuilder sb = new StringBuilder();
        while(i<s.length()){
            if(rev){
                for(int c=j;c>=i;c--){
                    if(c>s.length()-1){
                        c=s.length()-1;
                        j=c;
                    }
                    sb.append(s.charAt(c));
                }
                i+=k;
                j+=k;
                rev=false;
            }
            else{
                for(int c=i;c<=j;c++){
                    if(c>s.length()-1){
                        return sb.toString();
                    }
                    sb.append(s.charAt(c));
                }
                i+=k;
                j+=k;
                rev=true;
            }
        }
    return sb.toString();
    }
}