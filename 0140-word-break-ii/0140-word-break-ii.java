class Solution {
    public List<String> wordBreak(String s, List<String> wordDict) {
        List<String> res = new ArrayList<>();
        helper(res, s, "",wordDict);
        return res;
    }

    public void helper(List<String> res, String s,String path, List<String> wordDict){
        if(s.length()==0){
            res.add(path.trim()); 
            return;
        }
        for(String S:wordDict){
           if(s.startsWith(S)){
            helper(res, s.substring(S.length()),path+" "+S,wordDict);
           }

        }
    }
}