package UserCreation;
import java.util.Scanner;

class Product {
    private String name;
    private Double price;

    public Product(String name, Double price) {
        this.name = name;
        this.price = price;
    }

    public void displayProductDetails() {
        System.out.println("*********** Product Details ***********");
        System.out.println("Product name: " + name);
        System.out.println("Product price: $" + price);
    }
}

public class ProductClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("What's the product name: ");
        String productName = s.nextLine();

        System.out.print("What's the products price: $");
        Double productPrice = s.nextDouble();

        Product prod = new Product(productName, productPrice);

        prod.displayProductDetails();

        s.close();
    }
}
