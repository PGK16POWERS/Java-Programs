package MinimumOrMaximum;
import java.util.Arrays;

public class MinOrMax20 {
    public static void main(String[] args) {
        // CREATE AN ARRAY
        int[] calories = {2100, 1800, 2500, 2200, 1700, 1900, 2400, 2000, 2300, 1850};

        // USING STREAMS FIND THE LARGEST AND SMALLEST CALORIE
        int largestCalorie = Arrays.stream(calories).max().orElseThrow();
        int smallestCalorie = Arrays.stream(calories).min().orElseThrow();

        // DISPLAY FINDINGS
        System.out.println("Largest calorie: " + largestCalorie);
        System.out.println("Small Calorie: " + smallestCalorie);
    }
}
