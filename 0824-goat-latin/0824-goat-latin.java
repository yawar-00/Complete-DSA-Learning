class Solution {
    public String toGoatLatin(String sentence) {
        StringBuilder sb = new StringBuilder();
        String word[]= sentence.split(" ");
        String v ="aeiouAEIOU";
        for(int i=0;i<word.length;i++){
            if(v.contains(word[i].charAt(0)+"")){
                sb.append(word[i].charAt(0));  
            }
            for(int j=1;j<word[i].length();j++){
               sb.append(word[i].charAt(j));
            }
            if(!v.contains(word[i].charAt(0)+"")){
                sb.append(word[i].charAt(0));  
            }
            sb.append("ma");
            for(int k=0;k<=i;k++)
                sb.append("a");
            if(i<word.length-1){
                sb.append(" ");
            }
        }
    return sb.toString();

    }
}