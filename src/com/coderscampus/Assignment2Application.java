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
		int numberOfGuessesRemaining = numberOfGuesses;
		
		Random random = new Random();
		int randomNumber = 1 + random.nextInt(max);
		System.out.println(randomNumber);

		// Gets user inputs
		Scanner scan = new Scanner(System.in);

		// Run program if user has guesses.
		int userInput = 0;
		while (numberOfGuessesRemaining > 0) {
			if (numberOfGuessesRemaining == 5) {
			System.out.println("Pick a number between " + min + " and " + max + ":");
			}
			userInput = Integer.parseInt(scan.next());

			// Validate
			if (userInput < min || userInput > max) {
				// System.out.println("Pick a number between 1 and " + max + ":");
				continue;
			}

			// Checks if the user guess the correct number.
			if (userInput == randomNumber) {
				System.out.println("You Win!");
				break;
			} else {
				// Checks the result of the users input 
				if (userInput < randomNumber) {
					System.out.println("Please pick a higher number.");

				} else if (userInput > randomNumber) {
					System.out.println("Please pick a lower number.");

				}
			}
			numberOfGuessesRemaining--;
		} // Checks if the user correctly guesses the number on the last guess!
		if (numberOfGuessesRemaining == 0 && userInput != randomNumber) {
			System.out.println("You lose, the number to guess was: " + randomNumber);
			System.out.println("............GAME OVER...............");
		}
		scan.close();
	}
}