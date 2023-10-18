package com.prajwal.task2;

import java.util.*;

public class ATM {
    private final UserBankAccount userAccount;
    private final Scanner inp;

    //Passing the reference of another Class inside the constructor
    public ATM(UserBankAccount account) {
        userAccount = account;
        inp = new Scanner(System.in);
    }

    public void displayOptions() {
        System.out.println("ATM Menu:");
        System.out.println("1. Withdraw");
        System.out.println("2. Deposit");
        System.out.println("3. Check Balance");
        System.out.println("4. Exit");
    }

    public void transaction() {
        int choice;
        do {
            displayOptions();
            System.out.print("Enter your choice: ");
            choice = inp.nextInt();
            inp.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter the amount to withdraw(₹): ");
                    double withdrawAmount = inp.nextDouble();
                    if (userAccount.withdraw(withdrawAmount)) {
                        System.out.println("Withdrawn ₹ "+withdrawAmount+" successfully.");
                    } else {
                        System.out.println("Insufficient balance. Withdrawal failed.");
                    }
                    break;
                case 2:
                    System.out.print("Enter the amount to deposit(₹): ");
                    double depositAmount = inp.nextDouble();
                    userAccount.deposit(depositAmount);
                    System.out.println("Deposited ₹ "+depositAmount+" successfully.");
                    break;
                case 3:
                    double balance = userAccount.getBalance();
                    System.out.println("Current balance: ₹ " + balance);
                    break;
                case 4:
                    System.out.println("Exiting the ATM. Have a nice day!");
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        } while (choice != 4);
    }
}
