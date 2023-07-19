package day05.practice;




import java.util.Scanner;

//Account class with setters, getters, and constructors
class Account {
 private String accNo;
 private double balance;

 public Account(String accNo, double balance) {
     this.accNo = accNo;
     this.balance = balance;
 }

 // Getter and setter for account number
 public String getAccNo() {
     return accNo;
 }

 public void setAccNo(String accNo) {
     this.accNo = accNo;
 }

 // Getter and setter for balance
 public double getBalance() {
     return balance;
 }

 public void setBalance(double balance) {
     this.balance = balance;
 }
}

//ATM interface with methods: deposit, withdraw, and getBalance
public interface ATM {
 boolean deposit(Account account, double amount);
 boolean withdraw(Account account, double amount) throws Exception;
 double getBalance();
}

public class AxisATM implements ATM {
 private static final double WITHDRAWAL_CHARGES = 5;
 private static final double MIN_BALANCE = 5000;

 @Override
 public boolean deposit(Account account, double amount) {
     account.setBalance(account.getBalance() + amount);
     return true;
 }

 @Override
 public boolean withdraw(Account account, double amount) throws Exception {
     // Check if account balance is below minimum balance
     if (account.getBalance() < MIN_BALANCE)
         throw new Exception("Insufficient balance.");

     // Calculate total amount including withdrawal charges
     double totalAmount = amount + WITHDRAWAL_CHARGES;

     // Check if account balance is sufficient for withdrawal
     if (account.getBalance() >= totalAmount) {
         account.setBalance(account.getBalance() - totalAmount);
         return true;
     } else {
         throw new Exception("Insufficient balance.");
     }
 }

 @Override
 public double getBalance() {
     return account.getBalance();
 }
}

public class IciciATM implements ATM {
 private static final double WITHDRAWAL_CHARGES = 10;
 private static final double MIN_BALANCE = 10000;

 @Override
 public boolean deposit(Account account, double amount) {
     account.setBalance(account.getBalance() + amount);
     return true;
 }

 @Override
 public boolean withdraw(Account account, double amount) throws Exception {
     // Check if account balance is below minimum balance
     if (account.getBalance() < MIN_BALANCE)
         throw new Exception("Insufficient balance.");

     // Calculate total amount including withdrawal charges
     double totalAmount = amount + WITHDRAWAL_CHARGES;

     // Check if account balance is sufficient for withdrawal
     if (account.getBalance() >= totalAmount) {
         account.setBalance(account.getBalance() - totalAmount);
         return true;
     } else {
         throw new Exception("Insufficient balance.");
     }
 }

 @Override
 public double getBalance() {
     return account.getBalance();
 }
}

public class Main {
 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter account number: ");
     String accNo = scanner.nextLine();

     System.out.print("Enter initial balance: ");
     double balance = scanner.nextDouble();

     // Create an account object
     Account account = new Account(accNo, balance);

     // Create an ATM object based on user's choice
     ATM atm = null;
     System.out.print("Choose ATM (1: AxisATM, 2: IciciATM): ");
     int atmChoice = scanner.nextInt();

     if (atmChoice == 1) {
         atm = new AxisATM();
     } else if (atmChoice == 2) {
         atm = new IciciATM();
     } else {
         System.out.println("Invalid ATM choice.");
         scanner.close();
         return;
     }

     while (true) {
         System.out.println("Choose an option:");
         System.out.println("1. Deposit");
         System.out.println("2. Withdraw");
         System.out.println("3. Check Balance");
         System.out.println("4. Exit");

         int choice = scanner.nextInt();
         double amount;

         try {
             switch (choice) {
                 case 1:
                     System.out.print("Enter deposit amount: ");
                     amount = scanner.nextDouble();
                     atm.deposit(account, amount);
                     System.out.println("Deposit successful.");
                     break;
                 case 2:
                     System.out.print("Enter withdrawal amount: ");
                     amount = scanner.nextDouble();
                     atm.withdraw(account, amount);
                     System.out.println("Withdrawal successful.");
                     break;
                 case 3:
                     System.out.println("Current balance: " + atm.getBalance());
                     break;
                 case 4:
                     System.out.println("Exiting...");
                     scanner.close();
                     return;
                 default:
                     System.out.println("Invalid choice.");
             }
         } catch (Exception e) {
             System.out.println("Error: " + e.getMessage());
         }
     }
 }
}
