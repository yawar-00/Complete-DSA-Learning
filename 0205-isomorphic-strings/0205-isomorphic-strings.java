class Solution {
    public boolean isIsomorphic(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        HashMap<Character, Character> map1 =new HashMap<>();
        HashMap<Character, Character> map2 =new HashMap<>();
        for(int i =0;i<s.length();i++){
            char chs = s.charAt(i);
            char cht = t.charAt(i);
            if(map1.containsKey(chs)){
                if(map1.get(chs)!=cht){
                    return false;
                }
            }
            if(map2.containsKey(cht)){
               if(map2.get(cht)!=chs){
                    return false;
                } 
            }
            else{
                map1.put(chs,cht);
                map2.put(cht,chs);

            }
        }
        return true;
    }
}