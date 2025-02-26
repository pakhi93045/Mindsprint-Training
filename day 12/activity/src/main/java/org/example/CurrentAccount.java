package org.example;

public class CurrentAccount extends Account implements AccountMethods {
    public CurrentAccount(int accNumber, String holderName, int balance) {
        this.setAccNumber(accNumber);
        this.setHolderName(holderName);
        this.setBalance(balance);
    }

    @Override
    public void withdraw(int amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
            System.out.println("Withdraw of Rs." + amount + " is successful from your Current Account.\nAnd Balance is: " + getBalance());
        } else {
            System.out.println("Insufficient balance.");
        }
    }

    @Override
    public void deposit(int amount) {
        setBalance(getBalance() + amount);
        System.out.println("Deposit of Rs." + amount + " is successful in your Current Account.\nAnd Balance is: " + getBalance());
    }
}