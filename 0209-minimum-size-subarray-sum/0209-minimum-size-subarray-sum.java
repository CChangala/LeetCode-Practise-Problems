class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int i = 0;
        int j = 0;
        int n = nums.length;
        int runSum = 0;
        int min = Integer.MAX_VALUE;

        while(j<n && i<n){
            runSum = runSum+nums[j];
            while(runSum>=target){
                min = Math.min(min,j-i+1);
                runSum = runSum - nums[i];
                i++;
            }
            j++;
        }
        return min == Integer.MAX_VALUE ? 0 : min;
    }
}