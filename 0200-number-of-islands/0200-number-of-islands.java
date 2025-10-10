class Solution {
    public int numIslands(char[][] grid) {
        int count = 0;
        int rows = grid.length;
        int cols = grid[0].length;

        for(int i = 0; i<rows;i++){
            for(int j = 0; j<cols;j++){
                if(grid[i][j] == '1'){
                    count = count+1;
                    backtrack(grid, i, j);
                }

            }
        }
        return count;
    }

    public void backtrack(char[][] grid, int r, int c){
        int rows = grid.length;
        int cols = grid[0].length;

        if (r < 0 || c < 0 || r >= rows || c >= cols || grid[r][c] == '0') {
            return;
        }
        grid[r][c] = '0';
        backtrack(grid, r + 1, c);  // down
        backtrack(grid, r - 1, c);  // up
        backtrack(grid, r, c + 1);  // right
        backtrack(grid, r, c - 1); 
    }
}