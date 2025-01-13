package MinimumOrMaximum;
import java.util.Arrays;

public class MinOrMax2 {
    public static void main(String[] args) {
        // CREATE AND 
        double[] priceList = {12.90, 32.45, 23.35, 72.10, 65.23};
        
        // CREATE STREAMS FOR MIN AND MAX VALUES
        double min = Arrays.stream(priceList).min().orElseThrow();
        double max = Arrays.stream(priceList).max().orElseThrow();

        // DISPLAY FINDINGS
        System.out.println("Heighest is: " + max);
        System.out.println("Lowest is: " + min);
    }
}
