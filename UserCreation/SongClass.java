package UserCreation;
import java.util.Scanner;

class Song {
    // DEFINE YOUR FIELDS
    private String title;
    private String artist;

    public Song(String title, String artist){
        this.title = title;
        this.artist = artist;
    }

    public void displaySongDetails(){
        System.out.println("*********** Your Song Details ************");
        System.out.println("Title: " + title);
        System.out.println("Artist: " + artist);
    }
}

public class SongClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Enter your Title: ");
        String titleName = s.nextLine();

        System.out.print("Enter your artist name: ");
        String artistName = s.nextLine();

        Song songDetails = new Song(titleName, artistName);

        songDetails.displaySongDetails();

        s.close();
    }
}
