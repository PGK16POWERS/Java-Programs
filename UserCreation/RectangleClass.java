package UserCreation;
import java.util.Scanner;

class Rectangle {
    // DEFINE FIELDS
    private Double length;
    private Double width;

    // CREATE CONSTRUCTOR
    public Rectangle(Double length, Double width) {
        this.length = length;
        this.width = width;
    }

    // DISPLA THE AREA OF THE RECTANGLE
    public void DisplayArea() {
        System.out.print("\nThe area of your rectangle is: " + (length * width));
    }
}

public class RectangleClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Enter the length: ");
        Double length = s.nextDouble();

        System.out.println("Enter the width: ");
        Double width = s.nextDouble();

        // INITIALIZE THE RECTANGLE CLASS
        Rectangle rectArea = new Rectangle(length, width);

        rectArea.DisplayArea();

        s.close();
    }
}
