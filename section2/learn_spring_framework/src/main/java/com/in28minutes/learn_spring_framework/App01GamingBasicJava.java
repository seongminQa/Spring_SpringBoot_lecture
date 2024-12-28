package com.in28minutes.learn_spring_framework;

import com.in28minutes.learn_spring_framework.game.GameRunner;
import com.in28minutes.learn_spring_framework.game.PackManGame;

public class App01GamingBasicJava {

	public static void main(String[] args) {
		
//		var game = new SuperContraGame();
//		var gameRunner = new GameRunner(game);
//		gameRunner.run();
//		
//		var gameRunner1 = new GameRunner(new MarioGame());
//		gameRunner1.run();
//		var gameRunner2 = new GameRunner(new SuperContraGame());
//		gameRunner2.run();
		
		var game = new PackManGame();
		var gameRunner = new GameRunner(game);
		gameRunner.run();
		
	}

}
