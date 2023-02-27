package de.phl.programmingproject.banking;

public class BankDemo {
    public static void main(String[] args) {
        final BankAccount account = new BankAccount("John Doe", 12345, 1000.0);
        account.deposit(500.0);
        account.withdraw(200.0);
        final double balance = account.getBalance();
        System.out.println("Current balance: " + balance);
    }
}
