package Command;

public class Player {
	
	private int x = 0;
	private int y = 0;
	
	public Player() {
		
	}
	
	public void playerMoveRight() {
		this.x++;
	}
	
	public void playerMoveLeft() {
		this.x--;
	}
	
	public void playerMoveUp() {
		this.y++;
	}
	
	public void playerMoveDown() {
		this.y--;
	}

	public int getX() {
		return x;
	}

	public void setX(int x) {
		this.x = x;
	}

	public int getY() {
		return y;
	}

	public void setY(int y) {
		this.y = y;
	}
	
	

}
