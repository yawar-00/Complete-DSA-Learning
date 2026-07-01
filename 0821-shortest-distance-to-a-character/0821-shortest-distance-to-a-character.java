class Solution {
    public int[] shortestToChar(String s, char c) {
        int len =s.length();
        int arr[] = new int[len];
        for(int i =0;i<len;i++){
            if(s.charAt(i)==c){
                arr[i]=0;
                continue;
            }
            int l =i-1,r =i+1;
            while(l>=0||r<len){
                if(l>=0){
                    if(s.charAt(l)==c){
                        arr[i]=i-l;
                        break;
                    }
                    
                }
                if(r<len){
                    if(s.charAt(r)==c){
                        arr[i]=r-i;
                        break;
                    }
                }
                l--;
                r++;
            }

        }
        return arr;
    }
}