package MinimumOrMaximum;
import java.util.Arrays;

public class MinOrMax25 {
    public static void main(String[] args) {
        // CREATE AN ARRAY
        int[] numberOfBooksReadInAYear = {3, 5, 8, 6, 10, 4, 7, 9, 6, 5};

        // USE STREAM TO FIND HIGHEST AND LOWEST NUMBER
        int mostBooksRead = Arrays.stream(numberOfBooksReadInAYear).max().orElseThrow();
        int leastBooksRead = Arrays.stream(numberOfBooksReadInAYear).min().orElseThrow();

        // DISPLAY FINDINGS
        System.out.println("Most books read in a year: " + mostBooksRead);
        System.out.println("Least books read in a year: " + leastBooksRead);
    }
}
