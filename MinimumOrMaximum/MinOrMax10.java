package MinimumOrMaximum;
import java.util.Arrays;

public class MinOrMax10 {
    public static void main(String[] args) {
        // CREATE ARRAY
        int[] stepsWalked = {5630, 4820, 10250, 7890, 4310, 6210, 9980, 7590, 8230, 6590};

        // FIND HIGHEST AND LOWEST VALUES USING STREAM
        int highestNumberOfSteps = Arrays.stream(stepsWalked).max().orElseThrow();
        int lowestNumberOfSteps = Arrays.stream(stepsWalked).min().orElseThrow();

        // DISPLAY FINDINGS
        System.out.println("Highest number of steps: " + highestNumberOfSteps);
        System.out.println("Lowest number of steps: " + lowestNumberOfSteps);
    }
}
