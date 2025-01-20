package MinimumOrMaximum;
import java.util.Arrays;

public class MinOrMax21 {
    public static void main(String[] args) {
        // CREATE AN ARRAY
        int[] speedOfVehicles = {45, 62, 78, 80, 69, 72, 58, 67, 74};

        // USE STREAM TO FIND FASTEST AND SLOWEST SPEED
        int fastestVehicle = Arrays.stream(speedOfVehicles).max().orElseThrow();
        int slowestVehicle = Arrays.stream(speedOfVehicles).min().orElseThrow();

        // DISPLAY FINDINGS
        System.out.println("The Fastest Vehicle went " + fastestVehicle + " km/h");
        System.out.println("The Slowest vehicle went " + slowestVehicle + " km/h");

    }
}
