class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
        int i =0;
        while(i<nums.length){
            int idx = nums[i]-1;
            if(nums[i]!=nums[idx]){
                int flag = nums[i];
                nums[i]=nums[idx];
                nums[idx]=flag;
            }
            else{
                i++;
            }
        }
        for(i=0;i<nums.length;i++){
            if(nums[i]-1!=i){
                list.add(nums[i]);
            }
        }
        return list;
    }
}