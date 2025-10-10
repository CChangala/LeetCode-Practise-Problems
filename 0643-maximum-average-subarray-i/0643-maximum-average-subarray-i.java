class Solution {
    public double findMaxAverage(int[] nums, int k) {
        int i = 0;
        int j =0;
        double maxSum = Double.NEGATIVE_INFINITY;
        int sum = 0;
        while(j<nums.length){
            sum = sum + nums[j];
            if(j-i+1==k){
                maxSum = Math.max(maxSum,(double)sum/k);
                sum = sum - nums[i];
                i++;
            }
            j++;
        }
        return maxSum;
    }
}