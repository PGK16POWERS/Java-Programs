package EvenOrOdd;
import java.util.Scanner;

public class EvenOrOdd2 {
    public static void main(String[] args) {
        // CREATE INT VARIABLE
        int n;

        // IMPORT SCANNER
        Scanner s = new Scanner(System.in);

        // PROMPT USER TO ENTER A NUMBER
        System.out.print("Enter a number: ");
        n = s.nextInt();

        // Check to see if value is Even or Odd
        if(n % 2 == 0){
            System.out.print(n + " is Even.");
        } else {
            System.out.print("Value is Odd");
        }
    }
    
}
