package EvenOrOdd;
import java.util.Scanner;

public class EvenOrOdd3 {
    public static void main(String[] args) {
        // DECLARE INT VARIABLE
        int n;

        // IMPORT SANNER
        Scanner s = new Scanner(System.in);

        // PROMPT THE USER TO ENTER A VALUE
        System.out.print("Enter a value: ");
        n = s.nextInt();

        if(n % 2 == 0) {
            System.out.print(n + " is Even");
        } else {
            System.out.print("Value is Odd");
        }
    }
}
