package EvenOrOdd;
import java.util.Scanner;

public class EvenOrOdd19 {
    public static void main(String[] args) {
        // CREATE INT VARIABLE
        int value;

        try ( Scanner s = new Scanner(System.in)) {
            System.out.print("Enter a value: ");
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
