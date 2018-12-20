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
public class GameRenderer {

    private Map map;
    private Invader invader;
    private SpaceShip spaceship;
    private Shooting missile;

    public GameRenderer(SpaceShip spaceship, Invader invader, Map map, Shooting missile) {
        this.spaceship = spaceship;
        this.invader = invader;
        this.map = map;
        this.missile = missile;
    }

    public void render() {
        for (int y = 0; y < map.getHeight(); y++) {
            for (int x = 0; x < map.getWidth(); x++) {
                if (x == spaceship.spaceshipX && y == spaceship.spaceshipY) {
                    System.out.print("S");
                } else if (x == invader.invaderX && y == invader.invaderY) {
                    System.out.print("I");
                } else if (map.isWall(x, y)) {
                    System.out.print("|");
                } else if (x == missile.missileX && y == missile.missileY) {
                    System.out.print("+");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    
    
}
