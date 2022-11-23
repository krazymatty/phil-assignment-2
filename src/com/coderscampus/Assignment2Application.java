package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		// Game Variables you can change.
		int min = 1;
		int max = 100;
		int numberOfGuesses = 5;

		// Application variables
		int numberOfGuessesRemaining = numberOfGuesses - 1;
		int tries = numberOfGuessesRemaining + 1;
		Random random = new Random();
		int randomNumber = 1 + random.nextInt(max);

		// Gets user inputs
		System.out.println("Pick a number between " + min + " and " + max + ": \"You have " + tries + " chances\"");
		Scanner scan = new Scanner(System.in);

		// Run program if user has guesses.
		while (numberOfGuessesRemaining >= 0) {

			int userInput = Integer.parseInt(scan.next());

			// Checks if the user correctly guesses the number on the last guess!
			if (numberOfGuessesRemaining == 0) {
				if (userInput == randomNumber) {
					System.out.println("You Win!");
					break;
				}
				System.out.println("You lose, the number to guess was: " + randomNumber);
				System.out.println("............GAME OVER...............");
				break;
			}
			// Checks if the user guess the correct number.
			if (userInput == randomNumber) {
				System.out.println("You Win!");
				break;
			}
			// Checks the result of the users input and also makes sure it's not out of bounds.
			if (userInput < randomNumber && userInput <= max && userInput >= min) {
				System.out.println("Please pick a higher number.");
				numberOfGuessesRemaining = numberOfGuessesRemaining - 1;

			} else if (userInput > randomNumber && userInput <= max && userInput >= min) {
				numberOfGuessesRemaining = numberOfGuessesRemaining - 1;
				System.out.println("Please pick a lower number.");

			} else {
				System.out.println("Pick a number bewtween 1 and " + max + ":");

			}
		}
		scan.close();
	}
}
