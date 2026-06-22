class Solution {
    public int lengthOfLongestSubstring(String s) {
       Set<Character> set = new HashSet<>();
       int l=0,r=0;
       int max_length =0;
       while(r<s.length()){
        if(set.contains(s.charAt(r))){
            for(int i=l;i<=r;i++){
                set.remove(s.charAt(i));
                l++;
                if(!(set.contains(s.charAt(r)))){
                    break;
                }
            }
            
        }
        set.add(s.charAt(r));
        r++;
        max_length=Math.max(max_length,r-l);
        
       }
      
       return max_length;
    }
}