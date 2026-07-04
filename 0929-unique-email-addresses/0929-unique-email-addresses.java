class Solution {
    public int numUniqueEmails(String[] emails) {
        HashSet<String> set =new HashSet<>();
        for(String e:emails){
            StringBuilder sb =new StringBuilder();
            for(int i=0;i<e.length();i++){
                char c =e.charAt(i);
                if(sb.indexOf("@")==-1){
                    if(c=='+'){
                        int j=+1;
                        while(e.charAt(j)!='@')
                            j++;
                        sb.append('@');
                        i=j;
                    }
                    else if(c!='.'){
                        sb.append(c);
                    }
                }
                else{
                    sb.append(c);
                }
            }
            set.add(sb.toString());
        }
        return set.size();
    }
}