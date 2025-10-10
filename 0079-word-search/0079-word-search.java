class Solution {
    public boolean exist(char[][] board, String word) {
       int rows = board.length, cols = board[0].length;

        for (int r = 0; r < rows; r++) {
            for (int c = 0; c < cols; c++) {
                // start DFS when first char matches
                if (find(board,"", word, r, c)) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean find(char[][] board,String p,String word, int r , int c){
        int row = board.length;
        int col = board[0].length;
        //if we traverse the whole board and didn't find
        if(r<0 || r>=row || c<0 || c>=col){
            return false;
        }
        if (board[r][c] == '#') return false;

        p = p + board[r][c];
        if(!word.startsWith(p)){
            return false;
        }
        if (p.equals(word)) {
            return true;
        }
        char ch = board[r][c];
        board[r][c] = '#';

        boolean found = find(board, p, word, r+1,c) || find(board, p, word, r-1,c)
        || find(board, p, word, r,c+1) || find(board, p, word, r,c-1);

        board[r][c] = ch;

        return found;
        
    }
    
}