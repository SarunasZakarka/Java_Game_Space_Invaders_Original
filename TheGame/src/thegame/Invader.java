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
public class Invader {
	int invaderX = 1;
	int invaderY = 1;
	int invaderDx = 0;
	int invaderDy = 0;

	public Invader(int invaderX, int invaderY, int invaderDx, int invaderDy) {
		this.invaderX = invaderX;
		this.invaderY = invaderY;
		this.invaderDx = invaderDx;
		this.invaderDy = invaderDy;
	}

	public int getInvaderX() {
		return invaderX;
	}

	public void setInvaderX(int invaderX) {
		this.invaderX = invaderX;
	}

	public int getInvaderY() {
		return invaderY;
	}

	public void setInvaderY(int invaderY) {
		this.invaderY = invaderY;
	}

	public int getInvaderDx() {
		return invaderDx;
	}

	public void setInvaderDx(int invaderDx) {
		this.invaderDx = invaderDx;
	}

	public int getInvaderDy() {
		return invaderDy;
	}

	public void setInvaderDy(int invaderDy) {
		this.invaderDy = invaderDy;
	}

}