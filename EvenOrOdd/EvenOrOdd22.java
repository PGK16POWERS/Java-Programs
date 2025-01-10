package EvenOrOdd;
import java.util.Scanner;

public class EvenOrOdd22 {
    public static void main(String[] args) {
        // CREATE INT VARIABLES
        int value;

        try (Scanner s = new Scanner(System.in)) {
            System.out.print("Enter a value");
            value = s.nextInt();
        }

        // CHECK TO SEE IF THE VALUE IS EVEN OR ODD
        switch (value % 2) {
            case 0 :
                System.out.print(value + " is Even.");
                break;
            default:
                System.out.print(value + " is Odd.");
                break;
        }
    }
}
