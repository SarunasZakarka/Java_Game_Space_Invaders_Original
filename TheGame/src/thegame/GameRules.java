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
import java.io.IOException;

public class GameRules {

	private Map map;
	private Invader invader;
	private SpaceShip spaceship;
        private Shooting missile;

	public GameRules(SpaceShip spaceship, Invader invader, Map map, Shooting missile) {
		this.spaceship = spaceship;
		this.invader = invader;
		this.map = map;
                this.missile = missile;
	
	}

    
        public boolean Kill() {
		return (missile.missileX == invader.invaderX && missile.missileY == invader.invaderY);
	}

	
	public boolean isGameOver() {
		return (spaceship.spaceshipX == invader.invaderX && spaceship.spaceshipY == invader.invaderY);
	}

	public void endGame() throws IOException {
		System.out.println("GAME OVER!!!!");
		System.exit(0);
	}
	
	public void moveInvader() {
		int nextX = invader.invaderX + invader.invaderDx;
		int nextY = invader.invaderY + invader.invaderDy;
		
		if (map.isWall(nextX, nextY)) {
			invader.invaderX = 1;
			invader.invaderY += 1;
			
		}else {
			invader.invaderX = nextX;
			invader.invaderY = nextY;
		}	
                
                
                
	}
        public void movemissile() {
        }
	public void processCommand(Command command) throws Exception{
		switch(command) {
		
		case LEFT:
			tryMoveSpaceShip(-1, 0);
			break;
		case NOTHING:
			break;
		case QUIT:
			endGame();
			break;
		case RIGHT:
			tryMoveSpaceShip(1, 0);
			break;
                case SHOOT:
			
			break;
		
		default:
			break;
		
		}
	}

	private void tryMoveSpaceShip(int dx, int dy) {
		int nextX = spaceship.spaceshipX + dx;
		int nextY = spaceship.spaceshipY + dy;
		
		if (map.isWall(nextX, nextY))
			return;
		
		spaceship.setSpaceShipX(nextX);
		spaceship.setSpaceShipY(nextY);
	}
	

}

