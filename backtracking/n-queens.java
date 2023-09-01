public class backtrack {
    public static void main(String args[]) {
        int n = 10;
        char board[][] = new char[n][n];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }
        nQueens(board, 0);
        System.out.println("Total ways to solve n Queens = "+count);

    }
static int count = 0;
    public static void nQueens(char board[][], int row) {
        if (row == board.length) {
            printboard(board);
            count++;
            return;
        }
        for (int j = 0; j < board.length; j++) {
            if (issafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1); // function call

                board[row][j] = 'x'; // backtracking
            }
        }   
    }
  
    public static void printboard(char board[][]) {
        System.out.println("-----------chess board-----------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean issafe(char board[][], int row, int col) {
        // vertically up check
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // diagonal left check
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // diagonal right check
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--,j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }
        return true;
    }
}
