class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<Integer> path = new ArrayList<>();
        Set<List<Integer>> res = new HashSet<>();
        Arrays.sort(nums);
        subsets(nums, path, res, 0);
        return new ArrayList<>(res);
    }

    public void subsets(int[] nums,List<Integer>  path, Set<List<Integer>> res,int curr){
        if(curr == nums.length){

            res.add(new ArrayList<>(path));
            return;
        }
        path.add(nums[curr]);
        subsets(nums, path, res, curr+1);
        path.remove(path.size()-1);
        subsets(nums, path, res, curr+1);
    }
}