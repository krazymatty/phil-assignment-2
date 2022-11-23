package com.coderscampus;

import java.util.Random;
import java.util.Scanner;

public class Assignment2Application {

	public static void main(String[] args) {

		int numberOfGuessesRemaining = 4;
		Random random = new Random();
		int randomNumber = random.nextInt(1, 101);

		System.out.println("Pick a number between 1 and 100");
		Scanner scan = new Scanner(System.in);
		
		while (numberOfGuessesRemaining >= 0) {

			int userInput = Integer.parseInt(scan.next());

			if (numberOfGuessesRemaining == 0) {
				System.out.println("You lose, the number to guess was " + randomNumber);
				break;
			} 

			if (userInput == randomNumber) {
				System.out.println("You Win!");
				break;
			}
			if (userInput < randomNumber) {
				numberOfGuessesRemaining = numberOfGuessesRemaining - 1;
				System.out.println("Please pick a higher number,");
			} else if (userInput > randomNumber) {
				numberOfGuessesRemaining = numberOfGuessesRemaining - 1;
				System.out.println("Please pick a lower number,");

			}		


		}
		scan.close();

	}
}


