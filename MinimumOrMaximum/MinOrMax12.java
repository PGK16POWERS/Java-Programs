package MinimumOrMaximum;
import java.util.Arrays;

public class MinOrMax12 {
    public static void main(String[] args) {
        // CREATE ARRAY
        double[] productPrices = {3.99, 15.49, 7.25, 12.89, 5.99, 9.99, 2.49, 6.75, 4.99, 8.49};

        // USING STREAMS FIND THE HIGHEST AND LOWEST NUMBER
        double highestPrice = Arrays.stream(productPrices).max().orElseThrow();
        double lowestPrice = Arrays.stream(productPrices).min().orElseThrow();

        // DISPLAY FINDINGS
        System.out.println("Highest price is : R" + highestPrice);
        System.out.println("Lowest price is: R" + lowestPrice);
    }
}
