package org.example;

public class SavingAccount extends Account implements AccountMethods {
    public SavingAccount(int accNumber, String holderName, int balance) {
        this.setAccNumber(accNumber);
        this.setHolderName(holderName);
        this.setBalance(balance);
    }

    @Override
    public void withdraw(int amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdraw of Rs." + amount + " is successful from your Savings Account.\nAnd Balance is: " + getBalance());
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public void deposit(int amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit of Rs." + amount + " is successful in your Savings Account.\nAnd Balance is: " + getBalance());
    }
}