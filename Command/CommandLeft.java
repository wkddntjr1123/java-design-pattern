package Command;

public class CommandLeft implements PlayerCommand{
	
	private Player myPlayer;
	
	public CommandLeft(Player player) {
		this.myPlayer = player;
	}

	@Override
	public void execute() {
		this.myPlayer.playerMoveLeft();
	}

	@Override
	public void undo() {
		this.myPlayer.playerMoveRight();
	}

}
