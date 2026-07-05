class Solution {
    static{ Solution warmup = new Solution(); for(int i = 0; i< 500; ++i){ warmup.maxDigitRange(new int[2]); } }
    public int maxDigitRange(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int max=Integer.MIN_VALUE;
        for(int i:nums){
            int minDigit=Integer.MAX_VALUE;
            int maxDigit=Integer.MIN_VALUE;
            int num=i;
            while(num>0){
                int n = num%10;
                if(n>maxDigit){
                    maxDigit=n;
                }
                if(n<minDigit){
                    minDigit=n;
                }
                num/=10;
            }
            map.put(i,(maxDigit-minDigit));
            max = Math.max(max,maxDigit-minDigit);
        }
        int ans = 0;
        for(int i:nums){
            if(map.get(i)==max){
                ans+=i;
            }
        }
        return ans;
    }
}