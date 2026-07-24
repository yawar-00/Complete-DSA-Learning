class Solution {
    public int maxSubArray(int[] nums) {
        int sum =0;
        int max_sum =0;
        int min=Integer.MAX_VALUE;
        for(int n:nums){
            sum+=n;
            min = Math.min(min,-n);
            max_sum = Math.max(sum,max_sum);
            if(sum<0)
                sum=0;
        }
        if(max_sum==0){
            return -min;
        }
        return max_sum;
    }
}