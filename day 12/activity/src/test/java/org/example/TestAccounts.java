package org.example;

public class TestAccounts {
    public static void main(String[] args) {
        // Test for Withdrawal
        SavingAccount sa = new SavingAccount(101, "Alice", 100000);
        sa.withdraw(5000);
        assert sa.getBalance() == 95000 : "Test failed for SavingAccount withdrawal";

        CurrentAccount ca = new CurrentAccount(102, "Bob", 90000);
        ca.withdraw(10000);
        assert ca.getBalance() == 80000 : "Test failed for CurrentAccount withdrawal";

        // Test for Deposit
        sa.deposit(5000);
        assert sa.getBalance() == 100000 : "Test failed for SavingAccount deposit";

        ca.deposit(10000);
        assert ca.getBalance() == 90000 : "Test failed for CurrentAccount deposit";

        // Test for Insufficient Balance
        SavingAccount sa2 = new SavingAccount(103, "Charlie", 1000);
        sa2.withdraw(5000);
        assert sa2.getBalance() == 1000 : "Test failed for insufficient balance in SavingAccount";

        CurrentAccount ca2 = new CurrentAccount(104, "David", 2000);
        ca2.withdraw(3000);
        assert ca2.getBalance() == 2000 : "Test failed for insufficient balance in CurrentAccount";

        System.out.println("All tests passed.");
    }
}