package MinimumOrMaximum;
import java.util.Arrays;

public class MinOrMax24 {
    public static void main(String[] args) {
        // CREATE AN ARRAY
        int[] hoursWatchingMovies = {120, 98, 145, 110, 90, 130, 115, 140, 105, 125} ;

        // USING STREAMS FIND THE LONGEST AND SHORTEST TIME
        int longestHoursWatching = Arrays.stream(hoursWatchingMovies).max().orElseThrow();
        int shortestHoursWatching = Arrays.stream(hoursWatchingMovies).min().orElseThrow();

        // DISPLAY FINDINGS
        System.out.println("longest watch time: " + longestHoursWatching + " hours");
        System.out.println("Shortest watch time: " + shortestHoursWatching + " hours");
    }
}
