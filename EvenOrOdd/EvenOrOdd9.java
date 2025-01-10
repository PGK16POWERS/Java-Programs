package EvenOrOdd;
import java.util.Scanner;

public class EvenOrOdd9 {
    public static void main(String[] args) {
        // CREATE A INT VARIABLE
        int value;

        // IMPORT SCANNER MODULE
        Scanner s = new Scanner(System.in);

        // PROMPT THE USER TO ENTER A VALUE
        System.out.print("Enter a value: ");
        value = s.nextInt();

        // CHECK TO SEE IF THE VALUE IS EVEN OR ODD
        if (value % 2 == 0) {
            System.out.print(value + " is Even.");
        } else {
            System.out.print(value + " is Odd.");
        }
    }
}
