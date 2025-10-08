class Solution {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        int temp = 0;
        int n = x;
        while(x!=0){
            temp = temp*10 + x%10;
            x = x/10;
        }
        System.out.println(temp);
        if(temp == n){
            return true;
        }
        return false;
    }
}