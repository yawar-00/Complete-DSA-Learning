class Solution {
    public int removeDuplicates(int[] nums) {
        int k = 0;
        int current=-200;
        int last_index=0;
        for(int i=0;i<nums.length;i++){
            if(current!=nums[i]){
                current=nums[i];
                nums[last_index]=current;
                last_index++;
                k++;
            }
        }
        return k;
    }

}