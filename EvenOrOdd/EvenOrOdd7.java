package EvenOrOdd;
import java.util.Scanner;

public class EvenOrOdd7 {
    public static void main(String[] args) {
        // CREATE INT VARIABLE
        int v;

        // IMPORT SCANNER
        Scanner s = new Scanner(System.in);

        // PROMPT USER TO ENTER A VALUE
        System.out.print("Enter a value: ");
        v = s.nextInt();
        
        // CHECK TO SEE IF A VALUE IS EVEN OR ODD
        if (v % 2 == 0) {
            System.out.print(v + " is even.");
        } else {
            System.out.print("Value is odd.");
        }
    }
}
