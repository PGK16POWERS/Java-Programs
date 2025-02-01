package UserCreation;
import java.util.Scanner;

class BankAcc {
    // DEFINE YOUR FIELDS
    private String accountHolder;
    private Double balance;

    // CREATE YOUR CONSTRUCTOR
    public BankAcc(String accountHolder, Double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
    }

    public void displayAccountDetails() {
        System.out.println("\nAccount Details *********");
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: $" + balance);
    }
}

public class BankAccountClass {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.print("Whats your name: ");
        String accHolder = s.nextLine();

        System.out.print("What's your balance: $");
        Double accBalance = s.nextDouble();

        BankAcc bankClass = new BankAcc(accHolder, accBalance);

        bankClass.displayAccountDetails();

        s.close();
    }
    
}
