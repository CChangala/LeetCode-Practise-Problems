class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
      int n = letters.length;
    
      char res = ' ';
      int s = 0;
      int e = n-1;
      while(e>=s){
        int m = s + (e-s)/2;
        if(letters[m]>target){
            res = letters[m];
            e = m - 1;
        }
        else{
            s = m + 1;
        }
      }

    if(res==' '){
        return letters[0];
    }

      return res;
    }
}