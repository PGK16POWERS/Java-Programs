package MinimumOrMaximum;
import java.util.Arrays;

public class MinOrMax6 {
    public static void main(String[] args) {
        // DECLARE AND INITIALIZE AN ARRAY
        int[] scores = {23, 54, 65, 67, 78};

        // USE STREAMS TO FIND MIN AND MAX VALUES
        int minScore = Arrays.stream(scores).min().orElseThrow();
        int maxScore = Arrays.stream(scores).max().orElseThrow();

        // DISPLAY FINDINGS
        System.out.println("Highest score is: " + maxScore);
        System.out.println("Lowest score is: " + minScore);
    }
}
