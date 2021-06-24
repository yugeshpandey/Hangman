package com.game.logic;

import java.util.ArrayList;
import java.util.Arrays;
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
	
	//ALLIGATOR, L, _ _ _IGATOR
	public String unmaskWord(String originalWord, String rightInput, String maskedWord) {
		int wordLength = originalWord.length(); // 9
		String inputCapitals = rightInput.toUpperCase(); //"L"
		char inputChar = inputCapitals.charAt(0);//'L'
		String unmaskedWord = maskedWord;  
		
		ArrayList<Integer> charLocations = new ArrayList<Integer>();
		char testChar;
				
		for (int i = 0; i < wordLength ; i++) {
			testChar = originalWord.charAt(i);
			int charMatch = Character.compare(inputChar, testChar);
			if (charMatch == 0) {
				charLocations.add(i);
			}
					
		}
		
						
								
		return unmaskedWord;
	}
		

}
