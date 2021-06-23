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
		

}
