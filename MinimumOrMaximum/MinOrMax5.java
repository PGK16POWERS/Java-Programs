package MinimumOrMaximum;
import java.util.Arrays;

public class MinOrMax5 {
    public static void main(String[] args) {
        // DECLARE AND INITIALIZE ARRAY
        int[] marks = {34, 54, 30, 21, 20, 43};

        // CREATE STREAMS TO FIND THE MIN AND MAX VALUES
        int minAge = Arrays.stream(marks).min().orElseThrow();
        int maxAge = Arrays.stream(marks).max().orElseThrow();

        // DISPLAY FINDINGS
        System.out.println("Lowest age is: " + minAge + " years old.");
        System.out.println("Highest age is: " + maxAge + " years old.");
    }
}
