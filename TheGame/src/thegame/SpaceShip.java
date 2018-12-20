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
public class SpaceShip {
	int spaceshipX = 9;
	int spaceshipY = 11;

	public SpaceShip(int spaceshipX, int spaceshipY) {
		super();
		this.spaceshipX = spaceshipX;
		this.spaceshipY = spaceshipY;
	}

	public int getSpaceShipX() {
		return spaceshipX;
	}

	public void setSpaceShipX(int spaceshipX) {
		this.spaceshipX = spaceshipX;
	}

	public int getPSpaceShipY() {
		return spaceshipY;
	}

	public void setSpaceShipY(int spaceshipY) {
		this.spaceshipY = spaceshipY;
	}

}