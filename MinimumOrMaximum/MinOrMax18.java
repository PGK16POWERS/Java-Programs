package MinimumOrMaximum;
import java.util.Arrays;

public class MinOrMax18 {
    public static void main(String[] args) {
        // CREATE AN ARRAY
        int[] heightsOfPeople = {165, 172, 158, 174, 169, 162, 177, 168, 175};

        // USING ARRAYS STREAMS FIND THE LARGEST AND SMALLEST HEIGHT
        int tallestHeight = Arrays.stream(heightsOfPeople).max().orElseThrow();
        int shortestHeight = Arrays.stream(heightsOfPeople).min().orElseThrow();

        // DISPLAY FINDINGS
        System.out.println("Tallest: " + tallestHeight + " cm");
        System.out.println("Shortest: " + shortestHeight + " cm");
    }
}