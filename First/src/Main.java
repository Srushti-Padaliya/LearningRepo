import java.util.Scanner;  // Import the Scanner class
public class Main {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the layers you want to print: ");
        int layers = obj.nextInt();
        for (int i = 1; i <= layers; i++) {
            for (int j = 1; j <= layers - i; j++){
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++){
                System.out.print(" "+i);
            }
            System.out.println("");
        }
    }
}