package MinimumOrMaximum;
import java.util.Arrays;

public class MinOrMax17 {
    public static void main(String[] args) {
        // CREATE ARRAY
        int[] numberOfCars = {2, 3, 4,6,2};

        int maxInt = Arrays.stream(numberOfCars).max().orElseThrow();
        int minInt = Arrays.stream(numberOfCars).min().orElseThrow();

        System.out.println("The highest number in the array is: " + maxInt);
        System.out.println("The lowest number in the array is: " + minInt);
    }
}
