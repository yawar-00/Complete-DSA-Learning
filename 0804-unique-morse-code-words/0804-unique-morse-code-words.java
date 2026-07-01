class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        String[] arr = {
    ".-","-...","-.-.","-..",".","..-.","--.","....","..",
    ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
    "...","-","..-","...-",".--","-..-","-.--","--.."
};
        for(String w:words){
            String code ="";
            for(int i=0;i<w.length();i++){
                char ch = w.charAt(i);
                code +=arr[ch-'a']; 
            }
            set.add(code);
        }
        return set.size();
    }
}