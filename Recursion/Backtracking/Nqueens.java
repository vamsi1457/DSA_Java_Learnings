package Recursion.Backtracking;

public class Nqueens {
    public static void main(String[] args) {
        int n = 4;
        boolean[][] board = new boolean[n][n];
        System.out.println(queens(board, 0));
    }
    static int queens(boolean[][] board, int r){
        if(r==board.length){
            display(board);
            System.out.println();
            return 1;
        }
        int count =0;
        for(int col=0; col<board.length; col++){
            if(isSafe(board,r,col)){
                board[r][col] = true;
                count = count + queens(board, r+1);
                board[r][col] = false;
            }
        }
        return count;
    }
    private static boolean isSafe(boolean[][] board, int row, int col){
        for(int i=0; i<row; i++){
            if(board[i][col]){
                return false;
            }
        }
        // for diagonal left
        int diagonalLeft  = Math.min(row, col);
        for(int i=1; i<=diagonalLeft; i++){
            if(board[row-i][col-i]){
                return false;
            }
        }
        // for diagonal left
        int diagonalRight  = Math.min(row, board.length-col-1);
        for(int i=1; i<=   diagonalRight; i++){
            if(board[row-i][col+i]){
                return false;
            }
        }

        return true;
    }
    private static void display(boolean[][] board) {
        for(boolean[] row:board){
            for(boolean element:row){
                if(element){
                    System.out.print("Q ");
                }else{
                    System.out.print("X ");
                }
            }
            System.out.println();
        }
    }
}
