/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package thegame;



/**
 *
 * @author sarunas.zakarka
 */
public class Main {

	public static void main (String args[]) throws Exception{
		
		Map map = new Map();
		Invader invader = new Invader(1,1,1,0);
		SpaceShip spaceship = new SpaceShip(9, 11);
		Shooting missile = new Shooting(5,2,5,5);
		GameRenderer renderer = new GameRenderer(spaceship, invader, map, missile);
		
		GameRules gameRules = new GameRules(spaceship, invader, map, missile);
		
		UserInput userInput = new UserInput();
		
		while(true) {
		
			renderer.render();
			
			if (gameRules.isGameOver())
				gameRules.endGame();
                        else if(gameRules.Kill())
                            gameRules.endGame();
			
			Command command = userInput.getCommand();
			gameRules.processCommand(command);
		
			gameRules.moveInvader();
		}
	}


}


