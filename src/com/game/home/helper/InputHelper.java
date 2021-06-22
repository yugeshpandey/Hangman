package com.game.home.helper;

import java.util.Scanner;

public class InputHelper {
		
	public String promptUser(String message) {
		
		System.out.println(message);
		Scanner keyboard = new Scanner(System.in);
		String userInput = keyboard.nextLine();
		keyboard.close();
		return userInput;
		
		
	}
	

}
