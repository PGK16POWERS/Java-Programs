package EvenOrOdd;

import java.util.Scanner;

public class EvenOrOdd {
    public static void main(String[] args) {
        int n;

        // Set scanner
        Scanner s = new Scanner(System.in);

        System.out.print("Enter a number: ");

        n = s.nextInt();

        if(n % 2 == 0 ) {
            System.out.print(n + " is even");
        } else {
            System.out.print(n + " is odd");
        }


    }
}