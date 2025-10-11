class Solution {
    public List<List<Integer>> combine(int n, int k) {
        List<Integer> path = new ArrayList<>();
        List<List<Integer>> res = new ArrayList<>();
        combinations(n, k, path, res, 1);
        return res;
    }

    public void combinations(int n , int k , List<Integer> path, List<List<Integer>> res, int start){
        if(path.size() == k){
            res.add(new ArrayList<>(path));
        }

        for(int i = start ; i<=n;i++){
            path.add(i);
            combinations(n,k,path,res,i+1);
            path.remove(path.size() - 1);
        }

    }
}