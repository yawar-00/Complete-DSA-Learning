class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        Set<String> set = new HashSet<>();
        String[] arr = {
    ".-","-...","-.-.","-..",".","..-.","--.","....","..",
    ".---","-.-",".-..","--","-.","---",".--.","--.-",".-.",
    "...","-","..-","...-",".--","-..-","-.--","--.."
};
        for(String w:words){
            StringBuilder code =new StringBuilder();
            for(int i=0;i<w.length();i++){
                char ch = w.charAt(i);
                code.append(arr[ch-'a']); 
            }
            set.add(code.toString());
        }
        return set.size();
    }
}