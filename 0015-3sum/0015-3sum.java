class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        for(int i = 0; i< nums.length;i++){
            //List<Integer> list = new ArrayList<>();
            int target = -nums[i];
            Set<Integer> seen = new HashSet<>();

            for(int j = i+1; j<nums.length;j++){
                int complement = target - nums[j];
                if (seen.contains(complement)) {
                    res.add(Arrays.asList(nums[i], nums[j], complement));
                }
                seen.add(nums[j]);
            }  
        }

        return new ArrayList<>(res);
    }
}