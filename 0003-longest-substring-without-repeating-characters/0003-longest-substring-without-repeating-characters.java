class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int i = 0;
        int maxLen = 0;

        for(int j = 0; j< s.length(); j++){
            char ch = s.charAt(j);
            if(map.containsKey(ch)){
                i = Math.max(i, map.get(ch) + 1);
            }

            map.put(ch, j);

            // Update maximum window size
            maxLen = Math.max(maxLen, j - i + 1);

        }

        return maxLen;
    }
}