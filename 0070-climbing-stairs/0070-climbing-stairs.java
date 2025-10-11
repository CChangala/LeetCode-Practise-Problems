class Solution {
    public int climbStairs(int n) {
        if(n<=3){
            return n;
        }

        int prev1 = 3;
        int prev2 = 2;
        int curr = prev1;
        for(int i = 4;i<=n;i++){
            curr = prev2+prev1;
            prev2 = prev1;
            prev1 = curr;
        }
        return curr;
    }

    public int helper(int i,int n){
        if(i>n){
            return 0;
        }
        if(i == n){
            return 1;
        }

        return helper(i+1, n) + helper(i +2, n);
    }
}