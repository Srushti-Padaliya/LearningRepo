import java.util.Scanner;

public class tictactoe {
    int[][] board = new int[4][4];
    char playersymbol = 'X';
    public static void TICTACTOE(int row, int column, String value){

        for(int i = 1; i< 4; ++i) {
            for (int j = 1; j < 4; ++j) {
                if ((i == row) && (j == column)) {
                    System.out.print(value);
                } else {
                    System.out.print(String.valueOf(i)+String.valueOf(j));
                }

                if (j != 3) {
                    System.out.print(" | ");   // print vertical partition
                }
            }
            System.out.println();
            if (i != 3) {
                System.out.println("-----------");
            }
        }
    }
    public char checkwinner() {
        // Check rows and columns
        for (int i = 1; i < 4; i++) {
            if (board[i][0] == playersymbol && board[i][1] == playersymbol && board[i][2] == playersymbol ||
                    board[0][i] == playersymbol && board[1][i] == playersymbol && board[2][i] == playersymbol) {
                return playersymbol;
            }
        }

        // Check diagonals
        if (board[0][0] == playersymbol && board[1][1] == playersymbol && board[2][2] == playersymbol ||
                board[0][2] == playersymbol && board[1][1] == playersymbol && board[2][0] == playersymbol) {
            return playersymbol;
        }

        return 'N';
    }
    public static void main(String[] args) {

        tictactoe t1 = new tictactoe();
        Scanner S1 = new Scanner(System.in);
        //TICTACTOE(input);

        do {
            System.out.println("Enter the row and column number: ");
            int row =  S1.nextInt();
            int column =  S1.nextInt();
            TICTACTOE(row, column, "X");
        } while (t1.checkwinner() == 'N');

        t1.playersymbol = (t1.playersymbol == 'X') ? 'O' : 'X';

    }
}
