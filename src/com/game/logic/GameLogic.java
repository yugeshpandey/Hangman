package com.game.logic;

import java.util.Scanner;

public class GameLogic {
	
	private Scanner keyboard = new Scanner(System.in);
	
	public GameLogic() {
		
	}
	
	public boolean isWordMatch (String originalWord, char guessedLetter) {
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
