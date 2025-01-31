package UserCreation;
import java.util.Scanner;

class userProfile {
    
    private String name;
    private String email;

    public userProfile(String name, String email) {
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
        
    }
}