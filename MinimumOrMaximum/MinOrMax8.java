package MinimumOrMaximum;
import java.util.Arrays;

public class MinOrMax8 {
    public static void main(String[] args) {
        // CREATE ARRAY
        int[] peoplesAgeInAGroup = {25, 34, 19, 42, 58, 27, 31, 40, 22, 36};

        // FIND HIGHEST AND LOWEST AGE USING STREAMS
        int highestAge = Arrays.stream(peoplesAgeInAGroup).max().orElseThrow();
        int lowestAge = Arrays.stream(peoplesAgeInAGroup).min().orElseThrow();

        // DISPLAY FINDINGS
        System.out.println("Highest age in the group: " + highestAge);
        System.out.println("Lowest age in the group: " + lowestAge);
    }
}
