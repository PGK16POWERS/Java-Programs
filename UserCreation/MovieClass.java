package UserCreation;
import java.util.Scanner;

class Movie {
    // DEFINE YOUR FIELDS
    private String movieName;
    private int relYear;

    // CREATE YOUR CONSTRUCTOR
    public Movie(String movieName, int relYear) {
        this.movieName = movieName;
        this.relYear = relYear;
    }

    public void displayClassDetails() {
        System.out.println("Movie Details ***** ******");
        System.out.println("The Movie Title: " + movieName);
        System.out.println("Release Date: " + relYear);
    }
}

public class MovieClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("What's your favourite movie: ");
        String movie = s.nextLine();

        System.out.print("What year was it released: ");
        int year = s.nextInt();

        Movie movieC = new Movie(movie,year);

        movieC.displayClassDetails();

        s.close();
    } 
}
