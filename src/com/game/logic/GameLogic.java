package com.game.logic;

import java.util.Scanner;

public class GameLogic {
				
	public GameLogic() {
		
	}
	
	public boolean isWordMatch (String originalWord, String guessedLetter) {
		
		CharSequence guessedChar = guessedLetter.toUpperCase();
		if (originalWord.contains(guessedChar)) {
			return true;
		}
		return false;
	}
	
	public String promptQuestion() {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Guess a letter: ");
		String userInput = keyboard.nextLine();
		keyboard.close();
		
		return userInput;
	}
	
	// This method unmasks the masked word using the correct user input
	public String unmaskWord(String originalWords, String rightInput, String maskedWord) {

		char[] originalWordArray = originalWords.toCharArray();
		char[] maskedWordArray = maskedWord.toCharArray();
		char rightInputChar = rightInput.charAt(0);
		
		for (int i = 0; i < originalWordArray.length; i++) {
			
			if (originalWordArray[i] == Character.toLowerCase(rightInputChar) 
					|| originalWordArray[i] == Character.toUpperCase(rightInputChar)) {
				
				maskedWordArray[i] = Character.toUpperCase(rightInputChar);
				
			}
			
			
		}
		

		return String.valueOf(maskedWordArray);
				
	
	}
		

}
