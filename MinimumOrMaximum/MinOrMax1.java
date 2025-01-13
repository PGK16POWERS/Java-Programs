package MinimumOrMaximum;
import java.util.Arrays;

public class MinOrMax1 {
    public static void main(String[] args) {
        // CREATE ARRAY
        int[] scores = {23,43,53,23,5,43,54,65,76,67};

        // CONVERT THE ARRAY INTO STREAMS
        int min = Arrays.stream(scores).min().orElseThrow();
        int max = Arrays.stream(scores).max().orElseThrow();

        // DISPLAY FINDINGS
        System.out.println("Lowest Score is: " + min);
        System.out.println("Heighest score is: " + max);
    }
}
