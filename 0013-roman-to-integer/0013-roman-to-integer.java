class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> map =new HashMap<>(Map.of('I',1,
        'V',5,
        'X',10,
        'L',50,
        'C',100,
        'D',500,
        'M',1000
        ));
        int ans=0;
        for(int i=s.length()-1;i>=0;i--){
            ans+=map.get(s.charAt(i));
            if(i>0&&map.get(s.charAt(i))>map.get(s.charAt(i-1))){
                int j=i-1;
                while(j>=0&&map.get(s.charAt(i))>map.get(s.charAt(j))){
                    ans-=map.get(s.charAt(j));
                    j--;
                }
                i=j+1;
            }
        }
        return ans;
    }
}