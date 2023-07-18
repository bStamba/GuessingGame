package GuessingGamePackage;

import java.util.Random;

public class GuessingGame {

	public void startGame() {
		//Create instances of our player class for our three players.
		Player player1 = new Player();
		Player player2 = new Player();
		Player player3 = new Player();
		
		//Initializing variables for each of our player to hold their guess and a variable for our actual number.
		int p1guess = 0;
		int p2guess = 0;
		int p3guess = 0;
		int actualNumber = 0;
		int randUpperBound = 10;
		
		Random rand = new Random();
		actualNumber = rand.nextInt(randUpperBound);
		System.out.println("Lets bring our players out and get their guesses.");
		
		//Call our playerGuess method to get the input for our players' guess.
		p1guess = player1.getPlayerGuess();
		p2guess = player2.getPlayerGuess();
		p3guess = player3.getPlayerGuess();		
		player1.scannerClose();
		
		System.out.println("Our secret number is: " + actualNumber);
		
		//Use conditional statement to see whether the players guessed correctly or incorrectly, and state the result.
		if(p1guess == actualNumber) {System.out.println("Player 1 guessed CORRECTLY! WINNER!");}
		else {System.out.println("Player 1 guessed INCORRECTLY! Better luck next time.");}
		
		if(p2guess == actualNumber) {System.out.println("Player 2 guessed CORRECTLY! WINNER!");}
		else {System.out.println("Player 2 guessed INCORRECTLY! Better luck next time.");}
		
		if(p3guess == actualNumber) {System.out.println("Player 3 guessed CORRECTLY! WINNER!");}
		else {System.out.println("Player 3 guessed INCORRECTLY! Better luck next time.");}					
	}
}
