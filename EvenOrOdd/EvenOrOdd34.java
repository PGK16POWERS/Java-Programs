package EvenOrOdd;
import java.util.Scanner;

public class EvenOrOdd34 {
    public static void main(String[] args) {
        // CREATE INT VARIABLE
        int value;

        try (Scanner s = new Scanner(System.in)) {
            // PROMPT USER TO ENTER VALUE 
            System.out.print("Enter a value: ");
            // STORE VALUE
            value = s.nextInt();
        }

        // CHECK IF THE VALUE IS EVEN OR ODD
        if (value % 2 == 0) {
            System.out.print(value + " is Even.");
        } else {
            System.out.print(value + " is Odd.");
        }
    }
}