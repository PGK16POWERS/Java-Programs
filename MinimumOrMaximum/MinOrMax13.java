package MinimumOrMaximum;
import java.util.Arrays;

public class MinOrMax13 {
    public static void main(String[] args) {
        // CREATE ARRAY
        double[] travelDistance = {5.2, 12.6, 8.4, 15.9, 7.3, 10.1, 6.8, 9.4, 13.7, 11.5};

        // FIND SHORTEST AND LONGEST DISTANCE USING STREAM
        double longestDist = Arrays.stream(travelDistance).max().orElseThrow();
        double shortestDist = Arrays.stream(travelDistance).min().orElseThrow();

        // DISPLAY FINDINGS
        System.out.println("Longest distance is: " + longestDist + "km");
        System.out.println("Shortest distance is: " + shortestDist + "km");
    }
}
