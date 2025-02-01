package UserCreation;
import java.util.Scanner;

class Person {
    // DEFINE FIELDS
    private String name;
    private int age;

    // CREATE YOUR CONSTRUCTOR
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // DISPLAY PERSON DETAILS
    public void DisplayPersonFindings() {
        System.out.print(name + " is " + age + " years old.");
    }
}

public class PersonClass {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);

        System.out.print("What's your name: ");
        String userName = s.nextLine();

        System.out.print("How old are you: ");
        int userAge = s.nextInt();

        Person personClass = new Person(userName, userAge);

        personClass.DisplayPersonFindings();

        s.close();
    }
}
