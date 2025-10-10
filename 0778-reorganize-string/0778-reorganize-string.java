class Solution {
    public String reorganizeString(String s) {
        int n = s.length();
        int[] freq = new int[26];
        for(char ch:s.toCharArray()){
            freq[ch-'a'] = freq[ch - 'a'] + 1;
        }

        
        int maxFreq = 0, maxChar = 0;
         for (int i = 0; i < 26; i++) {
            if (freq[i] > maxFreq) {
                maxFreq = freq[i];
                maxChar = i;
            }
        }
        if (maxFreq > (n + 1) / 2) return "";

        char[] res = new char[n];
        int index = 0;
        while (freq[maxChar] > 0) {
            res[index] = (char) (maxChar + 'a');
            index += 2;
            freq[maxChar]--;
        }

        for (int i = 0; i < 26; i++) {
            while (freq[i] > 0) {
                if (index >= n) index = 1; // wrap to odd indices
                res[index] = (char) (i + 'a');
                index += 2;
                freq[i]--;
            }
        }
        return new String(res);
    }

    // count all charc done:
    // 
}