package EvenOrOdd;
import java.util.Scanner;

public class EvenOrOdd8 {
    public static void main(String[] args) {
        // CREATE A INT VARIABLE
        int value;

        // IMPORT SCANNER
        Scanner s = new Scanner(System.in);

        // PROMPT USER TO ENTER A VALUE
        System.out.print("Enter a value: ");
        value = s.nextInt();

        // CHECK TO SEE IF VALUE IS EVEN OR ODD
        if (value % 2 == 0 ) {
            System.out.print(value + " is Even.");
        } else {
            System.out.print(value + " is Odd.");
        }
    }
}
