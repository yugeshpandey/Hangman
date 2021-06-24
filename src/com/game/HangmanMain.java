package com.game;

import com.game.home.Home;
import com.game.logic.GameLogic;
import com.game.wordGenerator.TopicList;
import com.game.wordGenerator.WordGenerator;

public class HangmanMain {

	public static void main(String[] args) {

		Home home = new Home();
		// InputHelper inputHelper = new InputHelper();
		WordGenerator newWord = new WordGenerator();
		GameLogic gameLogic = new GameLogic();
		String[] chosenTopic = TopicList.getTopic(1); // Array of chosen list of words

		String randomWord = newWord.generateRandomWord(chosenTopic);
		String maskedWord = newWord.generateMaskedWord(randomWord);
		int livesLeft = 7;
		boolean isMatch;

		// Welcome screen
		home.welcome();
		// home.printStickFigure();
		
		String startResponse = gameLogic.promptQuestion("Press Y to start: ");
				
		if (startResponse.equals("Y") || startResponse.equals("y")) {
			
			while (livesLeft != 0) {
				System.out.println(maskedWord);
				char userInput = gameLogic.promptQuestionChar("Type your guess: ");
											
				isMatch = gameLogic.isWordMatch(randomWord, userInput);
				
				if (isMatch) {
					String unmaskedWord = gameLogic.unmaskWord(randomWord, userInput, maskedWord);

					System.out.println("Correct!");
					System.out.println(unmaskedWord);
					unmaskedWord = maskedWord;
						 
				} else {
					System.out.println("Incorrect!");
					livesLeft = livesLeft - 1;
				}
				
			}
		

		} else {
			System.out.println("Exiting Game");
		}

	}

}
