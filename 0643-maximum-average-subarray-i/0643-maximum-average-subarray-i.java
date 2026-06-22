class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int avg=0;
        for(int i=0;i<k;i++){
            avg+= nums[i];
        }
        int max_avg = avg; 
        for(int i=k;i<nums.length;i++){
            avg+=nums[i];
            avg-=nums[i-k];
            max_avg =Math.max(avg,max_avg);
        }
        return (double)max_avg/k;
    }
} 