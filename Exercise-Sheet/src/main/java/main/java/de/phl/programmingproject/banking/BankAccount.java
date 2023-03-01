package main.java.de.phl.programmingproject.banking;

public class BankAccount {
    private double balance;
    private final int accountNumber;

    /**
     * Creates a new bank account with the given balance and account number.
     * 
     * @param balance the balance
     * @param accountNumber the account number
     * @throws IllegalArgumentException if the balance or account number is less than 0
     */
    public BankAccount(final double balance, final int accountNumber) {
        if (balance < 0) {
            throw new IllegalArgumentException("Balance must be greater than 0");
        }
        if (accountNumber < 0) {
            throw new IllegalArgumentException("Account number must be greater than 0");
        }
        this.balance = balance;
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    /**
     * Deposits the given amount to the account.
     * 
     * @param amount the amount to deposit
     * @throws IllegalArgumentException if the amount is less than 0
     */
    public void deposit (final double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be greater than 0");
        }
        balance += amount;
    }
    
    /**
     * Withdraws the given amount from the account.
     * 
     * @param amount the amount to withdraw
     * @throws IllegalArgumentException if the amount is less than 0 or greater than the balance
     */
    public void withdraw (final double amount) {
        if (amount < 0) {
            throw new IllegalArgumentException("Amount must be greater than 0");
        }
        if (amount > balance) {
            throw new IllegalArgumentException("Amount must be less than balance");
        }
        balance -= amount;
    }

    public String toString() {
        return String.format("Account number: %d, Balance: %f", accountNumber, balance);
    }

    public static void main(String[] args) {
        // TODO Implement this operation to test the operations you implemented
    }
}
