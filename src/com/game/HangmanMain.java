package com.game;

import java.util.Scanner;

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
			System.out.println("Guess a letter: ");
						
//			int var1 = userInput.compareTo(randomWord);
//			
//			if (var1 == 0) {
//				System.out.println("Correct");
//			} else {
//				System.out.println("False");
//			}
					 
			
			
			
		} else {
			System.out.println("Exiting Game");
		}
		

	}

}
