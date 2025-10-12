class Solution {
    public int coinChange(int[] coins, int amount) {
        Arrays.sort(coins);
        int[][] memo = new int[coins.length][amount+1];
        for(int[] row:memo){
            Arrays.fill(row,-2);
        }
        int ans =rec(coins, amount, memo,0);
        if(ans==Integer.MAX_VALUE){
            return -1;
        } 
        return ans;
    }
    public int rec(int[] coins, int amount,int[][] memo,int i){
        if(amount==0){
            return 0;
        }
        if(amount < 0 || i >= coins.length){
            return Integer.MAX_VALUE;
        }
        if(memo[i][amount]!=-2){
            return memo[i][amount];
        }
        int inc = rec(coins,amount - coins[i],memo,i);
        if(inc != Integer.MAX_VALUE){
            inc += 1;
        }
        int exc = rec(coins,amount,memo,i+1);
        return memo[i][amount] = Math.min(inc, exc);

    }
}