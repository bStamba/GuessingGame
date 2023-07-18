package GuessingGamePackage;

public class GuessingGameMain {

	public static void main(String[] args) {

		GuessingGame guessGame = new GuessingGame();
		guessGame.startGame();
		
		System.out.println("Thanks for playing!");
		System.exit(0);
	}
}
