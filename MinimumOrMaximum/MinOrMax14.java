package MinimumOrMaximum;
import java.util.Arrays;

public class MinOrMax14 {
    public static void main(String[] args) {
        // CREATE ARRAY
        double[] waterConsumption = {2.5, 3.0, 2.2, 1.6, 2.8, 2.4, 3.2, 2.0, 2.7};

        // USING STREAM FIND THE HIGHEST AND LOWEST VALUES
        double highestWaterConsumption = Arrays.stream(waterConsumption).max().orElseThrow();
        double lowestWaterConsumption = Arrays.stream(waterConsumption).min().orElseThrow();

        // DISPLAY FINDINGS
        System.out.println("Highest water consumption: " + highestWaterConsumption + "L");
        System.out.println("Lowest Water consumption: " + lowestWaterConsumption + "L");
    }
}
