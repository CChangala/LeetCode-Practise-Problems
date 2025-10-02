class Solution {

    public static List<List<Integer>> getSubsets(int[] nums) {
        List<List<Integer>> result = new ArrayList<>();
        backtrack(new ArrayList<>(), nums, 0, result);
        return result;
    }

    private static void backtrack(List<Integer> current, int[] nums, int i, List<List<Integer>> result) {
        if (i == nums.length) {
            // make a copy because 'current' is mutable
            result.add(new ArrayList<>(current));
            return;
        }

        // Exclude current element
        backtrack(current, nums, i + 1, result);

        // Include current element
        current.add(nums[i]);
        backtrack(current, nums, i + 1, result);

        // Backtrack (remove last added)
        current.remove(current.size() - 1);
    }

    public List<List<Integer>> subsets(int[] nums) {
        return getSubsets(nums);
    }
}
