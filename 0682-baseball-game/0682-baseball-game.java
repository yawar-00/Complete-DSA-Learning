class Solution {
    public int calPoints(String[] operations) {
        ArrayList<Integer> list = new ArrayList<>();
        int i =-1;
        for(String s:operations){
            if(s.equals("C")||s.equals("D")||s.equals("+")){
                if(s.equals("C")){
                    list.remove(i);
                    i--;
                }
                else if(s.equals("D")){
                    list.add(2*list.get(i));
                    i++;
                }
                else{
                    list.add(list.get(i-1)+list.get(i));
                    i++;
                }
            }
            else{
                list.add(Integer.parseInt(s));
                i++;
            }
        }
        int sum=0;
        for(int n : list){
            sum+=n;
        }
        return sum;
    }
}