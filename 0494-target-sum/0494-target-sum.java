class Solution {
    public int findTargetSumWays(int[] nums, int target) {
        return backtrack(nums,target, 0, 0);
    }

    public int backtrack(int[] nums, int target, int curr, int i){
        if (i == nums.length) {
            return curr == target ? 1 : 0;
        }
        if(i>nums.length){
            return 0;
        }

        int sub = backtrack(nums,target,curr-nums[i],i+1);
        int add = backtrack(nums,target,curr+nums[i],i+1);
        return sub + add;
    }
}