package com.game.home;

public class Home {
	
	private String head = " O";
	private String leftArm = "/";
	private String rightArm = " \\";
	private String body = " |";
	private String leftFoot = "/";
	private String rightFoot = " \\";
	
	private String[] bodyParts = {head, leftArm, rightArm, body, leftFoot,rightFoot};
	
	public void printStickFigure(int livesLeft) {
		for (int i = 0; i < livesLeft; i++ ) {
			if (i == 1 || i== 4) {
				System.out.print(bodyParts[i]);
			} else {
				System.out.println(bodyParts[i]);
			}
		}
			
	}
	
	public void welcome() {
		System.out.println("\t Welcome to Hangman");
	}
	
	

}
