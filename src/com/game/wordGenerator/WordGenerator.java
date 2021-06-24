package com.game.wordGenerator;


public class WordGenerator {

	static int numberOfMaskedWords = 3;//number of words that are masked
	
	//generate a random number between variables "max" and "min".
	public int randomNumberGenerator(int max, int min) {
				
				int range = max - min + 1;
				int result = (int)(Math.random() * range) + min;
				
				return result;
									
	}
	  
	public String generateRandomWord(String[] wordArray) {
		int rand = randomNumberGenerator(wordArray.length-1, 0); //random number between 0 and number of items in array
		
		return wordArray[rand];
	}
	

		
	public String generateMaskedWord(String originalWord) {
		String maskedWord = originalWord;
		
		for (int i = 0; i< numberOfMaskedWords; i++) {
			int randomArrayIndex = randomNumberGenerator(originalWord.length()-1, 0);
			char randomChar = maskedWord.charAt(randomArrayIndex);
			maskedWord = maskedWord.replace(randomChar, '_');
		}
		return maskedWord;
	}
	
	

}
