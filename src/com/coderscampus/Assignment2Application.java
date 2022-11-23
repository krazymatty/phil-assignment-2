package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {
		int min = 1;
		int max = 100;
		int numberOfGuessesRemaining = 4;
		int tries = numberOfGuessesRemaining + 1;
		Random random = new Random();
		int randomNumber = random.nextInt(1, 51);

		System.out.println("Pick a number between "+ min + " and " + max + ": \"You have " + tries +" chances\"");
		Scanner scan = new Scanner(System.in);

		while (numberOfGuessesRemaining >= 0) {

			int userInput = Integer.parseInt(scan.next());

			if (numberOfGuessesRemaining == 0) {
				if	(userInput == randomNumber) {
					System.out.println("You Win!");
					break;
				}
				System.out.println("You lose, the number to guess was: " + randomNumber);
				System.out.println("............GAME OVER...............");
				break;
			} 

			if (userInput == randomNumber) {
				System.out.println("You Win!");
				break;
			}
			if (userInput < randomNumber && userInput < (max + 1) && userInput > (min - 1)) {

				System.out.println("Please pick a higher number.");
				numberOfGuessesRemaining = numberOfGuessesRemaining - 1;
			} else if (userInput > randomNumber && userInput < (max + 1) && userInput > (min - 1)) {
				numberOfGuessesRemaining = numberOfGuessesRemaining - 1;
				System.out.println("Please pick a lower number.");

			} else {
				System.out.println("Pick a number bewtween 1 and " + max + ":");

			}



		}
		scan.close();

	}
}


