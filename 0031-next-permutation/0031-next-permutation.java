class Solution {
    public void rev(int[] nums,int l, int r){
        while(l<r){
            int temp=nums[l];
            nums[l]=nums[r];
            nums[r]=temp;
            l++;
            r--;
        }
    }
    public void nextPermutation(int[] nums) {
        int piviot=-1;
        for(int i=nums.length-2;i>=0;i--){
            if(nums[i]<nums[i+1]){
                piviot=i;
                break;
            }
        }
        if(piviot==-1){
            rev(nums,0,nums.length-1);
        }
        else{
            for(int i=nums.length-1;i>piviot;i--){
                if(nums[i]>nums[piviot]){
                   int temp =nums[piviot];
                    nums[piviot]= nums[i];
                    nums[i]=temp;
                    break;
                }
            }
            
            rev(nums,piviot+1,nums.length-1);
        }
    }
}