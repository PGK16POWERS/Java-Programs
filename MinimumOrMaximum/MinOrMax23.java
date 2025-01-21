package MinimumOrMaximum;
import java.util.Arrays;

public class MinOrMax23 {
    public static void main(String[] args) {
        // CREATE AN ARRAY
        int[] screenTime = {45, 72, 89, 56, 120, 68, 80, 54, 95, 70};

        // USING STREAMS FIND THE LEAST AND THE MOST SCREAM TIMES
        int mostScreenTime = Arrays.stream(screenTime).max().orElseThrow();
        int leastScreenTime = Arrays.stream(screenTime).min().orElseThrow();

        // DISPLAY FINDINGS
        System.out.println("The most screen time: " + mostScreenTime);
        System.out.println("The least screen time: " + leastScreenTime);
    }
}
