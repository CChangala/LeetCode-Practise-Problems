class Solution {
    public int lengthOfLongestSubstring(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        int start = 0;
		int end = 0;
		HashSet<Character> set = new HashSet<>();
		int maxLen = 0;
		while(end<s.length()){
		    char ch = s.charAt(end);
		    while(set.contains(ch)){
		        
		        set.remove(s.charAt(start));
		        start++;
		        
		    }
		    set.add(ch);
		    maxLen = Math.max(maxLen,set.size());
		    end++;
		    
		}
		
		System.out.println(maxLen);
        return maxLen;
    }
}