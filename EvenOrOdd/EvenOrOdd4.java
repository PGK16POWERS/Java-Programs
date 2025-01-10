package EvenOrOdd;
import java.util.Scanner;

public class EvenOrOdd4 {
    public static void main(String[] args) {
        // CREATE A INT VARIABLE
        int n;
        
        // IMPORT SCANNER 
        Scanner s = new Scanner(System.in);

        // PROMPT USER TO ENTER A VALUE
        System.out.print("Enter a value: ");
        n = s.nextInt();

        // CHECK IF VALUE IS ODD OR EVEN
        if (n % 2 == 0) {
            System.out.print(n + " is Even");
        } else { 
            System.out.print("Value is Odd");
        }
    }
}
