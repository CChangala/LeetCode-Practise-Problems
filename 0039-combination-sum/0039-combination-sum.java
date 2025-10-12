class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        comSum(candidates,target, path,res,0,0);
        return res;
    }
    public void comSum(int[] candidates, int target,List<Integer> path,
    List<List<Integer>> res,int i, int curr){
        if(curr==target){
            res.add(new ArrayList<>(path));
            return;
        }
        if (curr > target || i >= candidates.length) {
            return;
        }

        path.add(candidates[i]);
        comSum(candidates,target, path,res,i,curr+candidates[i]);
        path.remove(path.size()-1);
        comSum(candidates,target, path,res,i+1,curr);
    }
}