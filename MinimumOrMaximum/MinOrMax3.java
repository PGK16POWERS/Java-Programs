package MinimumOrMaximum;
import java.util.Arrays;

public class MinOrMax3 {
    public static void main(String[] args) {
        // DECLARE AND
        int[] ages = {32,54, 52,2, 67, 87,73,7,5};

        // CREATE MIN AND MAX VALUES
        int min = Arrays.stream(ages).min().orElseThrow();
        int max = Arrays.stream(ages).max().orElseThrow();

        // DISPLAY FINDINGS
        System.out.println("Lowest age is: " + min);
        System.out.println("Highest age is: " + max);
    }
}
