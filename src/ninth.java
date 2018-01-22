//Eugene Yi
import javax.swing.*;

class Hangman {

	StringBuffer tempStringBuffer, tempStringBuffer2;

	String secretWordStr, player1Str, player2Str, guessStr, hint, output, letterStr, choiceStr;

	private int numberOfCharacters, numberOfCharacters2, numberOfCharacters3, numberOfCharacters4, guessAttempts1, guessAttempts2, player1Wins, player2Wins;

	public int i, choice;

	char letter, guessChar, secretWordChar;

	public Hangman() {

	player1Str = "player1";

	player2Str = "player2";

	guessStr = " ";

	guessAttempts1 = 0;

	guessAttempts2 = 0;

	player1Wins = 0;

	player2Wins = 0;

	}

	public void getPlayer1Name() {

	player1Str = JOptionPane.showInputDialog(null, "Player 1: Enter your name.");

	}

	public void getPlayer2Name() {

	player2Str = JOptionPane.showInputDialog(null, "Player 2: Enter your name.");

	}

	public void getChoice() {

	choiceStr = JOptionPane.showInputDialog(null, "Do you want to continue? Enter 0 for YES/ Enter 1 for NO");

	choice = Integer.parseInt(choiceStr);

	}

	private String setSecretWord() {

	secretWordStr = JOptionPane.showInputDialog(null, "Enter secret word.");

	numberOfCharacters4 = secretWordStr.length();

	for (int j = 0; j < numberOfCharacters4; j++)

		secretWordChar = secretWordStr.charAt(j);

		while (Character.isLetter(secretWordChar) == false) {

			System.out.println("Error");

			secretWordStr = JOptionPane.showInputDialog(null, "Enter secret word.");

			numberOfCharacters4 = secretWordStr.length();

		for (int j = 0; j < numberOfCharacters4; j++)

			secretWordChar = secretWordStr.charAt(j);

		}

	return secretWordStr;

	}

	private void getGuess() {

	guessStr = JOptionPane.showInputDialog(null, "Guess a letter.");

	guessChar = guessStr.charAt(0);

	numberOfCharacters3 = guessStr.length();

		while (Character.isLetter(guessChar) == false || numberOfCharacters3 != 1) {

			System.out.println("Error");

			guessStr = JOptionPane.showInputDialog(null, "Guess a letter.");

			guessChar = guessStr.charAt(0);

			numberOfCharacters3 = guessStr.length();

		}

	System.out.println(guessChar);

	}

	public void setStringBuffer() {

	setSecretWord();

	tempStringBuffer = new StringBuffer(secretWordStr);

	numberOfCharacters = tempStringBuffer.length();

		for (i = 0; i < numberOfCharacters; i++)

			tempStringBuffer.append("-");

	hint = tempStringBuffer.substring(numberOfCharacters, numberOfCharacters + i);

	System.out.println(hint);

	}

	public void appendStringBuffer() {

	tempStringBuffer2 = new StringBuffer(secretWordStr);

	numberOfCharacters2 = tempStringBuffer2.length();

	getGuess();

		for (int index = 0;index < numberOfCharacters2; index++) {

			letter = tempStringBuffer.charAt(index);

			letterStr = Character.toString(letter);

			if (letterStr.equalsIgnoreCase(guessStr)) {

				tempStringBuffer.setCharAt((index + numberOfCharacters2), guessChar);

			}

		}

	if (hint.equals(tempStringBuffer.substring(numberOfCharacters2, numberOfCharacters2 + i)))

		guessAttempts1++;

	hint = tempStringBuffer.substring(numberOfCharacters2, numberOfCharacters2 + i);

	System.out.println(hint);
	System.out.println("Guess Attempts: " + guessAttempts1);

	}

	public void appendStringBuffer2() {

	tempStringBuffer2 = new StringBuffer(secretWordStr);

	numberOfCharacters2 = tempStringBuffer2.length();

	getGuess();

		for (int index = 0;index < numberOfCharacters2; index++) {

			letter = tempStringBuffer.charAt(index);

			letterStr = Character.toString(letter);

			if (letterStr.equalsIgnoreCase(guessStr)) {

				tempStringBuffer.setCharAt((index + numberOfCharacters2), guessChar);

			}

		}

	if (hint.equals(tempStringBuffer.substring(numberOfCharacters2, numberOfCharacters2 + i)))

		guessAttempts2++;

	hint = tempStringBuffer.substring(numberOfCharacters2, numberOfCharacters2 + i);

	System.out.println(hint);
	System.out.println("Guess Attempts: " + guessAttempts2);

	}

	private void evalGuess1() {

	getPlayer1Name();

	setStringBuffer();

		while(guessAttempts1 < 10 && (hint.equalsIgnoreCase(secretWordStr)) != true) {

			appendStringBuffer();

		}

	if (guessAttempts1 == 10) {

		System.out.println("You lost.");

	} else {

		System.out.println("You bingo! You won.");
		player1Wins++;

	  }

	}

	private void evalGuess2() {

	getPlayer2Name();

	setStringBuffer();

		while(guessAttempts2 < 10 && (hint.equalsIgnoreCase(secretWordStr)) != true) {

			appendStringBuffer2();

		}

	if (guessAttempts2 == 10) {

		System.out.println("You lost.");

	} else {

		System.out.println("You bingo! You won.");
		player2Wins++;
		}

	getChoice();

	}

	public void playGame() {

	do { evalGuess1();

	evalGuess2();

	} while (choice == 0);

	System.out.println(player1Str + ": win # = " + player1Wins + " total guess # = " + guessAttempts1 + "\n" + player2Str +	": win # = " + player2Wins +
		" total guess # = " + guessAttempts2);
	}
}

class Ninth {

public static void main(String [] args) {


Hangman development = new Hangman();

development.playGame();
	}
}