class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> list= new ArrayList<>();
        int l=0;
        for(int r=1;r<s.length();r++){
            if(r==s.length()-1){
                if(s.charAt(r)==s.charAt(l)&&r-l>=2)
                    list.add(Arrays.asList(l,r));
            }
            if(s.charAt(r)!=s.charAt(l)){
                if(r-l>=3){
                    list.add(Arrays.asList(l,r-1));
                }
                l=r;
            }
        }
        return list;
    }
}