package org.example;

import java.util.Scanner;

public class Accounts {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the choice for account (Saving/Current): ");
        String accChoice = sc.next();
        System.out.println("Enter Account number: ");
        int accNumber = sc.nextInt();
        System.out.println("Enter your name: ");
        String holderName = sc.next();

        if (accChoice.equalsIgnoreCase("Saving")) {
            SavingAccount sa = new SavingAccount(accNumber, holderName, 100000);
            System.out.println("Withdraw/Deposit: ");
            String operationChoice = sc.next();
            System.out.println("Enter amount to " + operationChoice + " here: ");
            int amount = sc.nextInt();

            if (operationChoice.equalsIgnoreCase("Withdraw")) {
                sa.withdraw(amount);
            } else if (operationChoice.equalsIgnoreCase("Deposit")) {
                sa.deposit(amount);
            }
        } else if (accChoice.equalsIgnoreCase("Current")) {
            CurrentAccount ca = new CurrentAccount(accNumber, holderName, 90000);
            System.out.println("Withdraw/Deposit: ");
            String operationChoice = sc.next();
            System.out.println("Enter amount to " + operationChoice + " here: ");
            int amount = sc.nextInt();

            if (operationChoice.equalsIgnoreCase("Withdraw")) {
                ca.withdraw(amount);
            } else if (operationChoice.equalsIgnoreCase("Deposit")) {
                ca.deposit(amount);
            }
        } else {
            System.out.println("Invalid account choice.");
        }
    }
}