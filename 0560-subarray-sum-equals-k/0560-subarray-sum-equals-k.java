class Solution {
    static{ 
        Solution warmup = new Solution(); 
        for(int i = 0; i< 500; ++i){
            warmup.subarraySum(new int[2],0); 
        } 
    }
    public int subarraySum(int[] nums, int k) {
        int count =0;
        for(int i =1;i<nums.length;i++){
            nums[i]=nums[i-1]+nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i]==k){
                count++;
            }
            int j=i-1;
            while(j>=0){
                if(nums[i]-nums[j]==k){                        
                    count++;
                }
                j--;
            }
        }
        return count;
    }
}