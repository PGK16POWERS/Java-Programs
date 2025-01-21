package MinimumOrMaximum;
import java.util.Arrays;

public class MinOrMax22 {
    public static void main(String[] args) {
        // CREATE AN ARRAY
        int[] attendance = {22, 25, 18, 20, 24, 23, 19, 21, 22, 26};

        // USING STREAMS FIND THE LEAST AND THE MOST ATTENDANCE
        int mostAttendance = Arrays.stream(attendance).max().orElseThrow();
        int leastAttendance = Arrays.stream(attendance).min().orElseThrow();

        // DISPLAY FINDINGS
        System.out.println("Most attendance: " + mostAttendance);
        System.out.println("Least attendance: " + leastAttendance);
    }
}
