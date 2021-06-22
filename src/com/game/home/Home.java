package com.game.home;

public class Home {
	
	private String head = "O";
	private String leftArm = "/";
	private String rightArm = "\\";
	private String body = "|";
	private String leftFoot = "/";
	private String rightFoot = "\\";
	
	public void printStickFigure() {
		System.out.println(" " + head);
		System.out.print(leftArm);
		System.out.println(" " + rightArm);
		System.out.println(" " + body);
		System.out.print(leftFoot);
		System.out.print(" " + rightFoot);
			
	}
	
	public void welcome() {
		System.out.println("\t Welcome to Hangman");
	}
	
	

}
