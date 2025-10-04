class Solution {
    static boolean solve(char[][] board){
        int n = board.length;
        int r = -1;
        int c = -1;

        boolean emptyleft = true;
        for (int i = 0; i<n;i++){
            for(int j=0;j<n;j++){
                if(board[i][j] == '.'){
                    r= i;
                    c = j;
                    emptyleft = false;
                    break;  
                }
            }
            if(emptyleft == false){
                break;
            }
        }

        if(emptyleft == true){
            return true;
        }

        for(char i = '1'; i<='9';i++){
            if(isSafe(board, r, c,i)){
                board[r][c] = i;
                if(solve(board)){
                    //found answer
                    return true;
                }
                board[r][c] = '.';
            }
        }

        return false;        
    }

    static boolean isSafe(char[][] board, int row, int col,char num){

        //check row
        for(int i = 0; i<board.length;i++){
            if(board[row][i]==num){
                return false;
            }
        }

        //check col
        for(int i = 0; i<board.length;i++){
            if(board[i][col]==num){
                return false;
            }
        }
        //check the box
        int sqrt = (int)(Math.sqrt(board.length));
        int startRow = row - row % sqrt;
        int startCol = col - col % sqrt;


        for(int i = startRow;i<startRow+sqrt;i++){
            for(int j = startCol;j<startCol+sqrt;j++){
                if(board[i][j] == num){
                    return false;
                }
            }
        }
        return true;

    }
    public void solveSudoku(char[][] board) {
        solve(board);
    }
}