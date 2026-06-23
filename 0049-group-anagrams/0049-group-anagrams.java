class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String,List> map = new HashMap<>();
        for(String s : strs){
            int count[]= new int[26];
            for(char c:s.toCharArray()){
                count[c-'a']++;
            } 
            StringBuilder sb = new StringBuilder();
            for(int i:count){
                sb.append(i);
                sb.append("#");
            }
            String code =sb.toString();
            if(!map.containsKey(code)){
                map.put(code,new ArrayList<String>());
            }
            map.get(code).add(s);
        }
        return new ArrayList(map.values());
    }
}