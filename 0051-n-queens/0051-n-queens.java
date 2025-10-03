class Solution {

     public List<List<String>> solveNQueens(int n) {
        List<List<String>> solutions = new ArrayList<>();
        char[][] board = new char[n][n];

        // initialize board with '.'
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        nQueens(board, 0, solutions);
        return solutions;
    }

    static void nQueens(char[][] board, int r, List<List<String>> solutions) {
        if (r == board.length) {
            // Convert board to a list of strings
            List<String> oneSolution = new ArrayList<>();
            for (int i = 0; i < board.length; i++) {
                oneSolution.add(new String(board[i]));
            }
            solutions.add(oneSolution);
            return;
        }

        for (int c = 0; c < board.length; c++) {
            if (isSafe(board, r, c)) {
                board[r][c] = 'Q';          // place queen
                nQueens(board, r + 1, solutions);
                board[r][c] = '.';          // backtrack
            }
        }
    }

    static boolean isSafe(char[][] board, int r, int c) {
        // check column above
        for (int i = 0; i < r; i++) {
            if (board[i][c] == 'Q') return false;
        }

        // upper-left diagonal
        int row = r, col = c;
        while (row >= 0 && col >= 0) {
            if (board[row][col] == 'Q') return false;
            row--; col--;
        }

        // upper-right diagonal
        row = r; col = c;
        while (row >= 0 && col < board.length) {
            if (board[row][col] == 'Q') return false;
            row--; col++;
        }

        return true;
    }
}