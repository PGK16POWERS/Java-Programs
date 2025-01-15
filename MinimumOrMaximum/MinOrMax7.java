package MinimumOrMaximum;
import java.util.Arrays;

public class MinOrMax7 {
    public static void main(String[] args) {
        // CREATE ARRAY
        int[] testMarks = {78, 56, 92, 84, 67, 49, 88, 73, 61, 90};

        // FIND HIGHEST AND LOWEST VALUE USING STREAMS
        int highestMark = Arrays.stream(testMarks).max().orElseThrow();
        int lowestMark = Arrays.stream(testMarks).min().orElseThrow();

        // DISPLAY FINDINGS
        System.out.println("Hightest mark is: " + highestMark);
        System.out.println("Lowest mark is: " + lowestMark);
    }
}
