class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        HashMap<Integer,Integer> map = new HashMap<>();
        int i = 0;
        int j = 0;
        int n = nums.length;
        long sum = 0;
        long maxSum = 0;
        while (j < n) {
            sum += nums[j];
            map.put(nums[j], map.getOrDefault(nums[j], 0) + 1);

            // Shrink window if size exceeds k
            if (j - i + 1 > k) {
                sum -= nums[i];
                map.put(nums[i], map.get(nums[i]) - 1);
                if (map.get(nums[i]) == 0) {
                    map.remove(nums[i]);
                }
                i++;
            }

            // If window size == k and all distinct
            if (j - i + 1 == k && map.size() == k) {
                maxSum = Math.max(maxSum, sum);
            }

            j++;
        }

        
        return maxSum;
    }
}