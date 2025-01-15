package MinimumOrMaximum;
import java.util.Arrays;

public class MinOrMax11 {
    public static void main(String[] args) {
        // CREATE ARRAY
        double[] recordedTemperatures = {15.2, 18.5, 20.1, 16.8, 14.7, 19.3, 17.6, 16.5, 18.2, 15.9};

        // FIND THE HIGHEST AND LOWEST VALUES USING STREAM
        double highestTemp = Arrays.stream(recordedTemperatures).max().orElseThrow();
        double lowestTemp = Arrays.stream(recordedTemperatures).min().orElseThrow();

        // DISPLAY FINDINGS
        System.out.println("Highest temperature: " + highestTemp + "˚");
        System.out.println("Lowest temperature: " + lowestTemp + "˚");
    }
}
