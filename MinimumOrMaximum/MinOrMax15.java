package MinimumOrMaximum;
import java.util.Arrays;

public class MinOrMax15 {
    public static void main(String[] args) {
        // CREATE ARRAY
        double[] studyHours = {2.5, 3.0, 2.2, 1.6, 2.8, 2.4, 3.2, 2.0, 2.7};

        // USE STREAM TO FIND THE LONGEST AND SHORTEST STUDY HOURS
        double longestStudyTime = Arrays.stream(studyHours).max().orElseThrow();
        double shortestStudyTime = Arrays.stream(studyHours).min().orElseThrow();

        // DISPLAY FINDINGS
        System.out.println("Longest study time is: " + longestStudyTime + " hour(s)");
        System.out.println("Shortest study time is: " + shortestStudyTime + " hour(s)");
    }
}
