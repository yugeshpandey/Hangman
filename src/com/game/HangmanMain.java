package com.game;

import java.util.Scanner;

import com.game.home.Home;
import com.game.home.helper.InputHelper;
import com.game.logic.GameLogic;
import com.game.wordGenerator.TopicList;
import com.game.wordGenerator.WordGenerator;

public class HangmanMain {

	public static void main(String[] args) {

		Home home = new Home();
		//InputHelper inputHelper = new InputHelper();
		WordGenerator newWord = new WordGenerator();
		GameLogic gameLogic = new GameLogic();
		String[] chosenTopic = TopicList.getTopic(1); // Array of chosen list of words

		String randomWord = newWord.generateRandomWord(chosenTopic);
		String maskedWord = newWord.generateMaskedWord(randomWord);

		// Welcome screen
		home.welcome();
		home.printStickFigure();
		System.out.println("\n");
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Press Y to begin:");
		String startResponse = keyboard.nextLine();

		if (startResponse.equals("Y") || startResponse.equals("y")) {

			System.out.println(maskedWord);
			String userInput = gameLogic.promptQuestion();

			boolean isMatch;
			isMatch = gameLogic.isWordMatch(randomWord, userInput);

			if (isMatch) {
				String unmaskedWord = gameLogic.unmaskWord(randomWord, userInput, maskedWord);
				System.out.println(unmaskedWord);
			}

		} else {
			System.out.println("Exiting Game");
		}

	}

}
