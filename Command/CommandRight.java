package Command;

public class CommandRight implements PlayerCommand{
	
	private Player myPlayer;
	
	public CommandRight(Player player) {
		this.myPlayer = player;
	}

	@Override
	public void execute() {
		this.myPlayer.playerMoveRight();
	}

	@Override
	public void undo() {
		this.myPlayer.playerMoveLeft();
	}

}
