package UserCreation;
import java.util.Scanner;

class Car {
    // DEFINE FIELDS
    private String make;
    private String model;

    // CREATE CONSTRUCTOR
    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    // DISPLAY FINDINGS
    public void displayFindings() {
        System.out.println("Your favourite car: ");
        System.out.print("Your favourite make is " + make);
        System.out.print("\nYour favourite model is " + model);
    }
}

public class CarClass {
    public static void main(String[] args) {
        // INITIALIZE SCANNER
        Scanner s = new Scanner(System.in);

        // PROMPT THE USER TO ENTER THE FOLLOWING
        System.out.print("Enter your favourite car make: ");
        String make = s.nextLine();

        System.out.print("Enter your favourite Model: ");
        String model = s.nextLine();

        // INITIALIZE THE CAR CLASS
        Car favCar = new Car(make,model);

        favCar.displayFindings();

        s.close();
    }
}
