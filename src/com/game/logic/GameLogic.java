package com.game.logic;

import java.util.Scanner;

import com.game.home.Home;
import com.game.wordGenerator.TopicList;
import com.game.wordGenerator.WordGenerator;

public class GameLogic {

	private Scanner keyboard = new Scanner(System.in);
	WordGenerator newWord = new WordGenerator();
	Home home = new Home();

	public GameLogic() {

	}
	
	public boolean startGame() {
		int livesLeft = 7;
		boolean isMatch;
		boolean isGameWin = false;
		String[] chosenTopic = TopicList.getTopic(1); // Array of chosen list of words

		String startResponse = promptQuestion("Press Y to start, type any other key to exit: ");

		if (startResponse.equals("Y") || startResponse.equals("y")) {

			String randomWord = newWord.generateRandomWord(chosenTopic);
			String maskedWord = newWord.generateMaskedWord(randomWord);

			System.out.println(maskedWord);

			while (livesLeft != 0 && isGameWin != true) {

				char userInput = promptQuestionChar("\nType your guess: ");

				isMatch = isWordMatch(randomWord, userInput);
				maskedWord = unmaskWord(randomWord, userInput, maskedWord);

				if (isMatch) {
					System.out.println("Correct!");
					System.out.println(maskedWord);

				} else {
					System.out.println("Incorrect!");
					System.out.println(maskedWord);
					livesLeft = livesLeft - 1;
					home.printStickFigure(livesLeft);
				}

				if (maskedWord.equals(randomWord)) {
					isGameWin = true;
					System.out.println("Congratulations! You won!");
					return true;
				}

			}

			if (livesLeft == 0) {
				System.out.println("Sorry, you lost!");
				return true;
			}

		} else {
			System.out.println("Exiting Game");
		}
		return false;
	}

	public boolean isWordMatch(String originalWord, char guessedLetter) {
		char[] originalWordArray = originalWord.toCharArray();
		char guessedChar = Character.toUpperCase(guessedLetter);

		for (int i = 0; i < originalWordArray.length; i++) {
			if (guessedChar == originalWordArray[i]) {
				return true;
			}
		}

		return false;
	}

	public String promptQuestion(String customPrompt) {

		System.out.println(customPrompt);
		String userInput = keyboard.nextLine();

		return userInput;
	}

	public char promptQuestionChar(String customPrompt) {

		System.out.println(customPrompt);
		char inputChar = keyboard.next().charAt(0);
		return inputChar;
	}

	// This method unmasks the masked word using the correct user input
	public String unmaskWord(String originalWords, char rightInput, String maskedWord) {

		char[] originalWordArray = originalWords.toCharArray();
		char[] maskedWordArray = maskedWord.toCharArray();
		char rightInputChar = Character.toUpperCase(rightInput);

		for (int i = 0; i < originalWordArray.length; i++) {

			if (originalWordArray[i] == Character.toLowerCase(rightInputChar)
					|| originalWordArray[i] == Character.toUpperCase(rightInputChar)) {

				maskedWordArray[i] = Character.toUpperCase(rightInputChar);

			}
		}

		return String.valueOf(maskedWordArray);

	}

}
