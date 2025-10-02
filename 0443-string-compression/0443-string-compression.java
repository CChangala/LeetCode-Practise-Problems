class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        if(n==1){
            return 1;
        }
        String s = "";
        int i = 0;
        int j = 0;
        int count = 0;
        while(i<n && j<n){

            if(chars[i] == chars[j]){
                count++;
                j++;
            }
            else{
                if(count == 1){
                    s = s + chars[i];
                }
                else{
                    s = s + chars[i] + count;
                }
                i=j;
                count = 0;
            }
        }
        if(count==1){
            s = s + chars[i];
        }
        else{
            s = s + chars[i] + count;
        }
        System.out.println(s);
        for(int k = 0; k<s.length();k++){
            chars[k] = s.charAt(k);
        }

        return s.length();
        
    }
}