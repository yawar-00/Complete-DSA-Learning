class Solution {
    public void sortColors(int[] nums) {
        int i=0;
        int j=0;
        int k=0;
        for(int n :nums){
            if(n==0){
                i++;
            }
            else if(n==1){
                j++;
            }
            else{
                k++;
            }
        }
        int idx=0;
        while(i>0){
            nums[idx]=0;
            i--;
            idx++;
        }
        while(j>0){
            nums[idx]=1;
            j--;
            idx++;
        }
        while(k>0){
            nums[idx]=2;
            k--;
            idx++;
        }
    }
}