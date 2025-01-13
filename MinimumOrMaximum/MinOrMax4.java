package MinimumOrMaximum;
import java.util.Arrays;

public class MinOrMax4 {
    public static void main(String[] args) {
        // DECLARE AND INITIALIZE AN ARRAY
        double[] temps = {23.54, 34.43, 30.32, 31.67, 35.09, 33.56};

        // CREATE STREAMS TO FIND THE MIN AND MAX VALUES
        double min = Arrays.stream(temps).min().orElseThrow();
        double max = Arrays.stream(temps).max().orElseThrow();

        // DISPLAY FINDINGS
        System.out.println("Highest temp is: " + max);
        System.out.println("Lowest temp is: " + min);
    }
}
