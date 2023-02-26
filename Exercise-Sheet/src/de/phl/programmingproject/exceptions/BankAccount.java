package de.phl.programmingproject.exceptions;

public class BankAccount {
    private double balance;

    /**
     * Creates a new bank account.
     * 
     * @param balance
     *            The initial balance of the account.
     * @throws IllegalArgumentException if the balance is negative.
     */
    public BankAccount(double balance) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance must be positive!");
        }
        this.balance = balance;
    }

    /**
     * Withdraws the given amount from the account.
     * 
     * @param amount
     *            The amount to withdraw.
     * @throws IllegalArgumentException if the amount is negative.
     * @throws InsufficientFundsException if the amount is greater than the balance.
     */
    public void withdraw(double amount) {
        balance -= amount;
    }

    /**
     * Deposits the given amount to the account.
     * 
     * @param amount
     *            The amount to deposit.
     * @throws IllegalArgumentException if the amount is negative.
     */
    public void deposit(double amount) {
        balance += amount;
    }

    public double getBalance() {
        return balance;
    }

    public static void main(String[] args) {
        // TODO: Implement tasks 2 to 7.
    }
}
