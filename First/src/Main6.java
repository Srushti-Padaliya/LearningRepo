import java.util.Scanner;  // Import the Scanner class
public class Main6 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the layers you want to print: ");
        int layers = obj.nextInt();
        for (int i = 1; i <= layers; i++) {
            for (int l = 1; l <= layers - i ; l++) {
                System.out.print(" ");
            }
            for(int j = i-1;j >= 1; j--) {
                System.out.print(layers - j);
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(layers - k + 1 );
            }
            System.out.println("");
        }
    }
}