class Solution {
    public int uniquePaths(int m, int n) {
        int[][] arr = new int[m][n];
        for(int[] row:arr){
            Arrays.fill(row, -1);
        }
        return uniquePath(0, 0, m, n,arr);

    }

    public int uniquePath(int r, int c, int m, int n,int[][] arr) {
        if (r == m - 1 && c == n - 1)
            return 1; 

        if (r >= m || c >= n)
            return 0; 
        
        if(arr[r][c] != -1){
            return arr[r][c];
        }

        int down = uniquePath(r + 1, c, m, n,arr);
        int right = uniquePath(r, c + 1, m, n,arr);

        arr[r][c] = down + right;
        return arr[r][c];
    }
}
