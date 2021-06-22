package com.game.wordGenerator;

public class WordGenerator {
	
		
	public String generateRandomWord(String[] wordArray) {
		int rand = randomNumberGenerator(wordArray.length-1, 0); //random number between 0 and number of items in array
		
		return wordArray[rand];
	}
	
	//generate a random number between variables "max" and "min".
	public int randomNumberGenerator(int max, int min) {
		
		int range = max - min + 1;
		int result = (int)(Math.random() * range) + min;
		
		return result;
		
					
	}
	
	public String generateMaskedWord(String randomWord) {
		int max = randomWord.length()-1;
		int numberOfHiddenWords = 2;
		
		String maskedWord = randomWord;
		
		for (int i = 0; i <= numberOfHiddenWords; i++) {
			
			int randomNumber = randomNumberGenerator(max,0);
			char charToMask = randomWord.charAt(randomNumber);
			
			maskedWord = randomWord.replace(charToMask, '_');
		}
				
		
		return maskedWord;
	}

}
