package com.prajwal.task2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter the initial deposit amount(₹): ");
        double initialBalance = inp.nextDouble();
        UserBankAccount userAccount = new UserBankAccount(initialBalance); // Initial balance of $1000
        ATM atm = new ATM(userAccount);
        atm.transaction();
    }
}
