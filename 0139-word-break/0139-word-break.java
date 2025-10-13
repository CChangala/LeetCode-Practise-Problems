class Solution {
    public boolean wordBreak(String s, List<String> wordDict) {
        Map<String, Boolean> memo = new HashMap<>();
        return helper(s,wordDict,memo);
    }

    public boolean helper(String s , List<String> wordDict,Map<String,Boolean> memo){
        if(s.length() == 0){
            return true;
        }

        if (memo.containsKey(s)) return memo.get(s);

        for(String word: wordDict){
            
            if(s.startsWith(word)){
                String remaining = s.substring(word.length());
                if (helper(remaining, wordDict, memo)) {
                    memo.put(s, true); // ✅ store result for substring
                    return true;
                }
            }

        }
        memo.put(s, false);
        return false;
    }
}