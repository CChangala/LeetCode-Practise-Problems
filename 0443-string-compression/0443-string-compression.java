class Solution {
    public int compress(char[] chars) {
        int count = 0;
        int write = 0;
        int i = 0;
        int n = chars.length;
        //initial pointer
        while(i<n){
            count = 0;
            char current = chars[i];
            while(i<n && chars[i]==current){
                i++;
                count++;
            }
            chars[write] = current;
            write++;
            if(count>1){
                for (char c : String.valueOf(count).toCharArray()) {
                    chars[write++] = c;
                }
            }
        }
        return write;
    }
}