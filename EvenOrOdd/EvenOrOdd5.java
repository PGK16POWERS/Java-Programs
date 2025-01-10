package EvenOrOdd;
import java.util.Scanner;

public class EvenOrOdd5 {
    public static void main(String[] args) {
        // CREATE ITN VARIABLE
        int n;

        // IMPORT SCANNER
        Scanner s = new Scanner(System.in);

        // PROMPT THE USER 
        System.out.print("Enter a number: ");
        n = s.nextInt();

        // CHECK TO SEE IF VALUE IS EVEN OR ODD
        if (n % 2 == 0) {
            System.out.print(n + " is even");
        } else {
            System.out.print("Value is odd");
        }
    }
}
