class Solution {
    public boolean wordPattern(String pattern, String s) {
        String arr[] = s.split(" ");
        if(pattern.length()!=arr.length){
            return false;
        }
        HashMap<Character,String> map1 = new HashMap<>();
        HashMap<String,Character> map2 = new HashMap<>();
        for(int i=0;i<pattern.length();i++){
            char ch = pattern.charAt(i);
            if(map1.containsKey(ch)){
                if(!map1.get(ch).equals(arr[i])){
                    return false;
                }
            }
            if(map2.containsKey(arr[i])){
                if(map2.get(arr[i])!=ch){
                    return false;
                }
            }
                map1.put(ch,arr[i]);
                map2.put(arr[i],ch);
        }
        return true;
    }
}