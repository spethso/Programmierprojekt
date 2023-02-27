package de.phl.programmingproject.banking;

public class BankAccount {
    private final String ownerName;
    private final int accountNumber;
    private double balance;

    public BankAccount(final String ownerName, final int accountNumber, final double balance) {
        this.ownerName = ownerName;
        this.accountNumber = accountNumber;
        this.balance = balance;
    }

    public void deposit(final double amount) {
        if (amount < 0) {
            System.out.println("Amount must be positive.");
        }
        balance += amount;
    }

    public void withdraw(final double amount) {
        if (amount < 0) {
            System.out.println("Amount must be positive.");
        } else if (balance < amount) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
        }
    }

    public double getBalance() {
        return balance;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}