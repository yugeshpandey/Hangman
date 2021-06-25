package com.game;

import com.game.home.Home;
import com.game.logic.GameLogic;

public class HangmanMain {

	public static void main(String[] args) {

		Home home = new Home();
		// Welcome screen
		home.welcome();
		home.printStickFigure();
		System.out.println("\n");

		GameLogic gameLogic = new GameLogic();
		boolean isGameFinish = gameLogic.startGame();
		while (isGameFinish == true) {
			GameLogic gameLogicnew = new GameLogic();
			isGameFinish = gameLogicnew.startGame();
		}
	}

}
