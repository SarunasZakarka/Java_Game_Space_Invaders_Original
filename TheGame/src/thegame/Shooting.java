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

public class Shooting {
    int missileX =  2;
    int missileY =  2;
    int missileDx = 1;
    int missileDy = 1;
    
    public Shooting(int missileX, int missileY, int missileDx, int missileDy) {
		this.missileX = missileX;
		this.missileY = missileY;
		this.missileDx = missileDx;
		this.missileDy = missileDy;
	}

    public int getMissileX() {
        return missileX;
    }

    public void setMissileX(int missileX) {
        this.missileX = missileX;
    }

    public int getMissileY() {
        return missileY;
    }

    public void setMissileY(int missileY) {
        this.missileY = missileY;
    }

    public int getMissileDx() {
        return missileDx;
    }

    public void setMissileDx(int missileDx) {
        this.missileDx = missileDx;
    }

    public int getMissileDy() {
        return missileDy;
    }

    public void setMissileDy(int missileDy) {
        this.missileDy = missileDy;
    }
}
   
    
