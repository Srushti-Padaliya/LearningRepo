import java.util.*;
public class Main
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. rows: ");
        int rows = sc.nextInt();

        System.out.println("Enter no. columns: ");
        int columns = sc.nextInt();

        System.out.println("Enter "+rows*columns+" elements of the matrix: ");

        int[][] mat = new int[rows][columns];
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<columns; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        System.out.println("Matrix: ");
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<columns; j++){
                System.out.print(mat[i][j]+ " ");
            }

            System.out.println();
        }

        System.out.println("Transpose of the given matrix: ");
        for (int i = 0; i<columns; i++){
            for (int j = 0; j<rows; j++){
                System.out.print(mat[j][i]+ " ");
            }

            System.out.println();
        }

    }
}
