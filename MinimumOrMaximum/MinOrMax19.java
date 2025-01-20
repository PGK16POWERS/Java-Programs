package MinimumOrMaximum;
import java.util.Arrays;

public class MinOrMax19 {
    public static void main(String[] args){
        // CREATE AN ARRAY
        double[] WeightsOfPeople = {55.8, 68.3, 72.5, 61.2, 80.4, 65.7, 58.9, 74.1, 63.5, 70.8};

        // USING STREAMS FIND THE HEAVIEST AND LIGHTEST WEIGHT
        double heaviestWeight = Arrays.stream(WeightsOfPeople).max().orElseThrow();
        double lightestWeight = Arrays.stream(WeightsOfPeople).min().orElseThrow();

        // DISPLAY FINDINGS
        System.out.println("Heaviest Weight: " + heaviestWeight + " kg");
        System.out.println("Lightest Weight: " + lightestWeight + " kg");
    }
}
