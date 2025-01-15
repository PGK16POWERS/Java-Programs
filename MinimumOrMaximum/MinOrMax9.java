package MinimumOrMaximum;
import java.util.Arrays;

public class MinOrMax9 {
    public static void main(String[] args) {
        // CREATE ARRAY
        int[] monthlyExp = {1200, 800, 950, 1400, 700, 1100, 1300, 900, 850, 1250};

        // FIND HIGHEST AND LOWEST VALUES USING STREAM
        int highestExp = Arrays.stream(monthlyExp).max().orElseThrow();
        int lowestExp = Arrays.stream(monthlyExp).min().orElseThrow();

        // DISPLAY FINDINGS
        System.out.println("Highest expense is: " + highestExp);
        System.out.println("Lowest expense is: " + lowestExp);
    }
}
