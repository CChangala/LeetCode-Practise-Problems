class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int[] sol = new int[2];
        for(int i = 0; i<nums.length;i++){
            int comp = target - nums[i];
            
            if(map.containsKey(comp)){
                sol[0]=i;
                sol[1]=map.get(comp);
            }
            map.put(nums[i],i);
        }
        return sol;
    }
}