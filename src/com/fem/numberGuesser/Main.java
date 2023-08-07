package com.fem.numberGuesser;

import java.util.Scanner;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        boolean playAgain = true;

        while (playAgain) {
            playNumberGuesserGame(in);

            System.out.println("Would you like to play again? Y/N");
            String response = in.next();
            playAgain = response.equalsIgnoreCase("y");
        }

        System.out.println("Thanks for playing!");

        in.close();
    }

    public static void playNumberGuesserGame(Scanner in) {
        Random rand = new Random();
        int randomNumber = rand.nextInt(100) + 1;
        int numberOfTries = 0;

        boolean win = false;

        while (!win) {
            System.out.print("Please enter a number between 0 and 100 ");
            int guess = in.nextInt();
            numberOfTries++;

            if (guess == randomNumber) {
                System.out.println("You Win!");
                System.out.println("The number was " + randomNumber);
                System.out.println("It took you " + numberOfTries + " tries");
                win = true;
            } else if (guess >= randomNumber) {
                System.out.println("Too High!");
            } else {
                System.out.println("Too Low!");
            }
        }
    }
}