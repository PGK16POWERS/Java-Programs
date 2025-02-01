package UserCreation;
import java.util.Scanner;

class LapTop {
    // DEFINE YOUR FIELDS
    private String brand;
    private Double price;

    public LapTop(String brand, Double price) {
        this.brand = brand;
        this.price = price;
    }

    public void displayFavFindings() {
        System.out.println("Your Computer Details ************");
        System.out.println("Your Laptop Brand: " + brand);
        System.out.println("The price: $" + price);
    }
}

public class LaptopClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter your Laptop Brand: ");
        String brandName = s.nextLine();

        System.out.print("Enter the Laptop price: $");
        Double laptopPrice = s.nextDouble();

        LapTop laptopDet = new LapTop(brandName, laptopPrice);

        laptopDet.displayFavFindings();

        s.close();
    }
}
