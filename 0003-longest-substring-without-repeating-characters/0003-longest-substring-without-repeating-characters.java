class Solution {
    public int lengthOfLongestSubstring(String s) {
        int l = 0;
        int r = 0;
        int n = s.length();
        HashSet<Character> set = new HashSet<>();
        int maxLen = Integer.MIN_VALUE;

        while(l<n && r<n){

            while(r<n && !set.contains(s.charAt(r))){
                set.add(s.charAt(r));
                r++;
            }
            set.remove(s.charAt(l));
            l++;

            maxLen = Math.max(maxLen, r-l+1);


        }
        return maxLen == Integer.MIN_VALUE?0:maxLen;
    }
}