package Command;

public class PlayerController {
	
	private CommandRight right;
	private CommandLeft left;
	private CommandUp up;
	private CommandDown down;
	
	public PlayerController() {}

	public void setRight(CommandRight right) {
		this.right = right;
	}

	public void setLeft(CommandLeft left) {
		this.left = left;
	}

	public void setUp(CommandUp up) {
		this.up = up;
	}

	public void setDown(CommandDown down) {
		this.down = down;
	}
	
	public void pressRight() {
		right.execute();
	}
	
	public void pressLeft() {
		left.execute();
	}
	
	public void pressUp() {
		up.execute();
	}
	
	public void pressDown() {
		down.execute();
	}

}
