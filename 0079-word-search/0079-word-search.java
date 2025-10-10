class Solution {
    public boolean exist(char[][] board, String word) {
        for (int i = 0; i < board.length; i++) {
        for (int j = 0; j < board[0].length; j++) {
            if (board("",board, word, i, j)) return true;
        }
        }
        return false;
        }

    public boolean board(String p,char[][] board, String word,int r , int c){
        if (p.equals(word)) return true;
        if (r < 0 || c < 0 || r >= board.length || c >= board[0].length) return false;
        if (board[r][c] == '#' || p.length() >= word.length()) return false;

        char ch = board[r][c];
        if (ch != word.charAt(p.length())) return false;

        board[r][c] = '#';

        boolean down = board(p+ch,board,word,r+1,c);
        boolean right = board(p+ch,board,word,r,c+1);
        boolean up=board(p+ch,board,word,r-1,c);
        boolean below=board(p+ch,board,word,r,c-1);
        board[r][c] = ch;
        return down || right || up || below;

    }


    
}