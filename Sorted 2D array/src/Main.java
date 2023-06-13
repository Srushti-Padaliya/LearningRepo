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

        int[] arr = new int[rows*columns];
        int[][] mat = new int[rows][columns];

        for (int i = 0; i<rows; i++){
            for (int j = 0; j<columns; j++){
                mat[i][j] = sc.nextInt();
            }
        }

        int index = 0;
        System.out.println("Matrix: ");
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<columns; j++){
                arr[index]=(mat[i][j]);
                System.out.print(mat[i][j]+ " ");
                index++;
            }

            System.out.println();
        }

        index = 0;
        Arrays.sort(arr);
        System.out.println("Sorted Matrix: ");
        for (int i = 0; i<rows; i++){
            for (int j = 0; j<columns; j++){
                mat[i][j] = arr[index];
                index++;
                System.out.print(mat[i][j]+ " ");
            }

            System.out.println();
        }



    }
}
