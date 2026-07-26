class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> set = new HashSet<>();
        for(int j=0;j<nums.length-2;j++){
            HashMap<Integer, Integer> map = new HashMap<>();
            for(int k=j+1;k<nums.length;k++){
                int element = -(nums[j]+nums[k]);
                if(map.containsKey(element)){
                    List<Integer> temp = Arrays.asList(nums[j], nums[k], element);
                    Collections.sort(temp);
                    set.add(temp);
                }
                map.put(nums[k],0);
            }
        }
        return new ArrayList<>(set);
    }
}