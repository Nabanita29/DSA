class Solution {
    public String tictactoe(int[][] moves) {
        // Initialize the 3x3 Tic-Tac-Toe board
        char[][] board = new char[3][3];

        // Process each move
        for (int i = 0; i < moves.length; i++) {
            int row = moves[i][0];
            int col = moves[i][1];
            // If the index of player is even then it is 'X' else 'O'
            char player = (i % 2 == 0) ? 'X' : 'O';
            board[row][col] = player;
            if (checkWinner(player, board)) {
                return player == 'X' ? "A" : "B";
            }
        }
        // Determine if the game is a draw or pending
        return moves.length == 9 ? "Draw" : "Pending";
    }

    // Function to check if the current player has won
    private boolean checkWinner(char player, char[][] board) {
        // Check rows and columns
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == player && board[i][1] == player && board[i][2] == player) ||
                (board[0][i] == player && board[1][i] == player && board[2][i] == player)) {
                return true;
            }
        }
        // Check diagonals
        if ((board[0][0] == player && board[1][1] == player && board[2][2] == player) ||
            (board[2][0] == player && board[1][1] == player && board[0][2] == player)) {
            return true;
        }
        return false;
    }

    
}
