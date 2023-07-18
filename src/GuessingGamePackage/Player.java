package GuessingGamePackage;

import java.util.Scanner;

public class Player {

	Scanner scanner = new Scanner(System.in);
	//Method that creates an guessNumber integer variable for our player's guess, and a scanner to read the player input.
	//Takes our player input and assigns it to our integer guessNumber variable which is returned.
	public int getPlayerGuess() {
		int guessNumber = 0;
		System.out.println("Player, please enter in an integer between 0-10 for your guess.");
		
		//Use the scanner to read out integer input and return the integer guess.
		if(scanner.hasNextInt()) {
			guessNumber = scanner.nextInt();
			scanner.nextLine();
			System.out.println("Player guess is: " + guessNumber);	
		}		
		return guessNumber;
	}
	
	//Method to close our scanner.
	public void scannerClose() {
		scanner.close();
	}
}
