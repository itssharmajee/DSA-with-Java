package Backtracking;

public class NQueen {
    // place N queens on an N x N chessboard such that no 2 queens csn attack each
    // others

    public static boolean isSafe(char board[][], int row, int col) {
        // vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }

    // public static void nQueen(char board[][], int row) {
    //     if (row == board.length) {
    //         // printBoard(board);
    //         count++;
    //         return;
    //     }
    //     for (int j = 0; j < board.length; j++) {
    //         if (isSafe(board, row, j)) {
    //             board[row][j] = 'Q';
    //             nQueen(board, row + 1);
    //             board[row][j] = 'X';
    //         }
    //     }

    // }

// this function will return true with one solution if there is possible placement 
    public static boolean nQueen(char board[][], int row) {
        if (row == board.length) {
            // printBoard(board);
            count++;
            return true;
        }
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if(nQueen(board, row + 1)){
                    return true;
                }
                board[row][j] = 'X';
            }
        }
        return false;

    }

    static int count = 0;
    public static void printBoard(char chessBoard[][]) {
        System.out.println("___________chess board ____________");
        for (int i = 0; i < chessBoard.length; i++) {
            for (int j = 0; j < chessBoard[1].length; j++) {
                System.out.print(chessBoard[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int n=4;
        char chess[][] = new char[n][n];
        for (int i = 0; i < chess.length; i++) {
            for (int j = 0; j < chess.length; j++) {
                chess[i][j]='X';
            }
        }
        // nQueen(chess, 0);
        // System.out.println("number of possible way to place = "+count);


        if(nQueen(chess, 0)){
            System.out.println("possible solution");
            printBoard(chess);
        }else{
            System.out.println("not possible solution");
        }
    }
}
