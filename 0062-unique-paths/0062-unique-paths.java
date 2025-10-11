class Solution {
    public int uniquePaths(int m, int n) {
        int[][] dp = new int[m][n];
        for (int[] row : dp)
            Arrays.fill(row, -1);
        return helper(0,0,m,n,dp);
    }
    public int helper(int r, int c, int m, int n,int[][] dp){
        if(r==m-1 && c==n-1){
            return 1;
        }
        if(r<0 || c<0  || c>=n || r>=m){
            return 0;
        }
        if(dp[r][c] != -1){return dp[r][c];}
        dp[r][c] = helper(r + 1, c, m, n, dp) + helper(r, c + 1, m, n, dp);
        return dp[r][c];
    }
}