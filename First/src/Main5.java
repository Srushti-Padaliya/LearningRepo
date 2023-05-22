import java.util.Scanner;  // Import the Scanner class
public class Main5 {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the layers you want to print: ");
        int layers = obj.nextInt();
        for (int i = layers; i >= 1; i--) {
            for (int l = 1; l <= layers - i ; l++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for(int k = i-1;k >= 1; k--) {
                System.out.print(k);
            }
            System.out.println("");
        }
    }
}