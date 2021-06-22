package com.game;

import com.game.home.Home;
import com.game.home.helper.InputHelper;
import com.game.wordGenerator.TopicList;
import com.game.wordGenerator.WordGenerator;

public class HangmanMain {

	public static void main(String[] args) {
		
		Home home = new Home();
		InputHelper inputHelper = new InputHelper();
		WordGenerator newWord = new WordGenerator();
		String[] chosenTopic = TopicList.getTopic(1); //Array of chosen list of words
			
		String randomWord= newWord.generateRandomWord(chosenTopic);
		String maskedWord = newWord.generateMaskedWord(randomWord);
		
		//Welcome screen
		home.welcome();
		home.printStickFigure();
		System.out.println("\n");
		String startResponse = inputHelper.promptUser("Press Y to begin ");
		
		
		if(startResponse.equals("Y") || startResponse.equals("y")) {
						
			System.out.println(maskedWord);
		} else {
			System.out.println("Exiting Game");
		}
		

	}

}
