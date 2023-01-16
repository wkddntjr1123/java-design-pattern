package Command;

import java.util.Random;

  public class Main {

	public static void main(String[] args) {
		
		Random rnd = new Random();
		
		Player thePlayer = new Player();
		
		CommandRight cRight = new CommandRight(thePlayer);
		CommandLeft cLeft = new CommandLeft(thePlayer);
		CommandUp cUp = new CommandUp(thePlayer);
		CommandDown cDown = new CommandDown(thePlayer);
		
		PlayerController controller = new PlayerController();
		
		controller.setRight(cRight);
		controller.setLeft(cLeft);
		controller.setUp(cUp);
		controller.setDown(cDown);
		
		for(int i = 0; i < rnd.nextInt(100); i++) {
			controller.pressRight();
		}
		
		for(int i = 0; i < rnd.nextInt(100); i++) {
			controller.pressLeft();
		}
		
		for(int i = 0; i < rnd.nextInt(100); i++) {
			controller.pressUp();
		}
		
		for(int i = 0; i < rnd.nextInt(100); i++) {
			controller.pressDown();
		}
		
		System.out.println("Player position: X = " + thePlayer.getX() + " Y = " + thePlayer.getY());
		
	}

}
