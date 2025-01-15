package MinimumOrMaximum;
import java.util.Arrays;

public class MinOrMax16 {
    public static void main(String[] args) {
        // CREATE ARRAY
        int[] scores = {1200, 950, 1430, 1100, 870, 1020, 1340, 980, 1280, 900};

        // FIND THE HIGHEST AND LOWEST SCORE USING STREAM
        int highestScore = Arrays.stream(scores).max().orElseThrow();
        int lowestScore = Arrays.stream(scores).min().orElseThrow();

        // DISPLAY FINDINGS
        System.out.println("Highest score is: " + highestScore);
        System.out.println("Lowest score is: " + lowestScore);
    }
}
