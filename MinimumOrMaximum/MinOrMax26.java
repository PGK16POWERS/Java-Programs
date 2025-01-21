package MinimumOrMaximum;
import java.util.Arrays;

public class MinOrMax26 {
    public static void main(String[] args) {
        // CREATE AN ARRAY
        int[] electricalUsage = {250,320,290,310,280,270,300,340,260,330};

        // USE STREAMS TO FIND THE HIGHEST AND LOWEST USAGE
        int highestUsage = Arrays.stream(electricalUsage).max().orElseThrow();
        int lowestUsage = Arrays.stream(electricalUsage).min().orElseThrow();

        // DISPLAY FINDINGS
        System.out.println("Highest usage: " + highestUsage + " kW/h");
        System.out.println("Lowest usage: " + lowestUsage + " kW/h");
    }
}
