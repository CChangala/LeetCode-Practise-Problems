class Solution {
    public boolean isValidSudoku(char[][] board) {
        boolean res = true;
        for(int i = 0; i<board.length; i++){
            for(int j = 0; j<board[0].length;j++){
                if(board[i][j] != '.'){
                    if(!isSafe(board,i,j,board[i][j])){
                        return false;
                    }
                }
            }
        }
        return res;
    }

    public boolean isSafe(char[][] board, int row, int col,char num){
        //check row
        for(int i = 0; i<board.length;i++){
            if(board[row][i]==num  && i!=col){
                return false;
            }
        }

        //check col
        //check col
        for(int i = 0; i<board.length;i++){
            if(board[i][col]==num && i!=row){
                return false;
            }
        }
        //check the box
        int sqrt = (int)(Math.sqrt(board.length));
        int startRow = row - row % sqrt;
        int startCol = col - col % sqrt;


        for(int i = startRow;i<startRow+sqrt;i++){
            for(int j = startCol;j<startCol+sqrt;j++){
                if(board[i][j] == num && j!=col && i!=row){
                    return false;
                }
            }
        }
        return true;

    }
}