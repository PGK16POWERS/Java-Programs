package UserCreation;
import java.util.Scanner;

class UserProfile {
    
    private String name;
    private String email;

    public UserProfile(String name, String email) {
        this.name = name;
        this.email = email;
    }

    public void displayProfile() {
        System.out.println("User profile: ");
        System.out.println("Name: " + name);
        System.out.println("Email: " + email);
    }
}

public class UserSchema {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        // Get users name
        System.out.println("Enter your name: ");
        String name = s.nextLine();

        // Get users email
        System.out.println("Enter your Email: ");
        String email = s.nextLine();

        UserProfile user = new UserProfile(name, email);

        user.displayProfile();

        s.close();
    }
}