package com.prajwal.task1;

import java.util.Random;
import java.util.Scanner;

public class NumbersGame {

    public static void main(String[] args) {

        int min = 1;
        int max = 100;

        // User can try until 10 attempts
        int maxAttempts = 10;

        int rounds =0;
        int score = 0;

        //If a user wants to play another round
        boolean nextRound = true;

        Scanner inp = new Scanner(System.in);
        Random random = new Random();

        System.out.println("------------------------------");
        System.out.println("Welcome to the Numbers Game !!");
        System.out.println("------------------------------");
        System.out.println("You have to guess the number between\n"+min+" & "+max+" with a maximum of "+maxAttempts+" attempts and Multiple rounds !");
        System.out.println("-----------------------------------------------");

        while (nextRound){

            int target = random.nextInt(max - min + 1) + min;
            int attempts = 0;

            System.out.println("------------------------------");
            System.out.println("Round "+rounds+1+" : ");
            System.out.println("------------------------------");

            while (attempts<maxAttempts){

                System.out.println("Enter the Guess: ");
                int userGuess = inp.nextInt();
                attempts++;

                if (userGuess==target){
                    System.out.println("Congratulations! You have guessed the correct number in "+attempts+" attempt(s)");
                    score++;
                    break;
                } else if (userGuess<target) {
                    System.out.println("Too Low. Guess a higher number. You have "+(maxAttempts-attempts)+" attempts left.");
                } else {
                    System.out.println("To High. Guess a lower number. You have "+(maxAttempts-attempts)+" attempts left.");
                }

            }

            if (attempts==maxAttempts){
                System.out.println("You are out of attempts.");
            }

            System.out.println("Do you want to play another round ? (y/n): ");
            String res = inp.next();

            if (res.equals("n")){
                nextRound=false;
            } else {
                rounds++;
            }

        }

        System.out.println("Gave Over. You won "+score+" rounds !");

    }

}
