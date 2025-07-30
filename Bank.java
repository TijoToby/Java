  import java.util.Scanner;

class BankAccount {
    String accountNumber;
    String accountHolder;
    double balance;
    BankAccount(String accNumber, String accHolder, double bal) {
        accountNumber = accNumber;
        accountHolder = accHolder;
        balance = bal;
    }
    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("₹" + amount + " deposited successfully.");
        } else {
            System.out.println("Invalid deposit amount.");
        }
    }
    void displayDetails() {
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolder);
        System.out.println("Balance: ₹" + balance);
    }
}

public class Bank {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
          System.out.print("Enter Account Number: ");
        String accNUmber = in.nextLine();
          System.out.print("Enter Account Holder Name: ");
        String accHolder = in.nextLine();
  System.out.print("Enter Initial Balance: ₹");
        double bal = in.nextDouble();
   BankAccount account = new BankAccount(accNUmber, accHolder, bal);
  System.out.print("Enter amount to deposit: ₹");
        double depositAmount = in.nextDouble();
        account.deposit(depositAmount);
        System.out.println("\nUpdated Account Details:");
        account.displayDetails();
  in.close();
    }
}
