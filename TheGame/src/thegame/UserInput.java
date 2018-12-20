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
import java.util.Scanner;

public class UserInput {

	private Scanner scanner = new Scanner(System.in);
	
	public Command getCommand() {
		char n = scanner.next().charAt(0);
		return getCommand(n);
	}

	public Command getCommand(char keyChar) {
		switch(keyChar) {
		case 'a':
			return Command.LEFT;
		case 'd':
			return Command.RIGHT;
		case 'q':
			return Command.QUIT;
                case 'o':
			return Command.SHOOT;
		default:
			return Command.NOTHING;
		}	
	}

}
