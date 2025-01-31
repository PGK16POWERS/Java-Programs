package UserCreation;
import java.util.Scanner;

class Book {
    // CREATE YOUR FIELDS
    private String author;
    private String title;

    public Book(String author, String title){
        this.author = author;
        this.title = title;
    }

    // DEFINE YOUR METHOD
    public void DisplayAuthorAndTitle() {
        System.out.println("Your book details are");
        System.out.println("Your favourite author is: " + author);
        System.out.println("Your favourite book is: " + title);
    }
}

public class BookClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Name your favourite author: ");
        String authorName = s.nextLine();

        System.out.print("Name your favourite book: ");
        String bookTitle = s.nextLine();

        Book book = new Book(authorName,bookTitle);

        book.DisplayAuthorAndTitle();

        s.close();
    }
}
