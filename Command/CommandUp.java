package Command;

public class CommandUp implements PlayerCommand{
	
	private Player myPlayer;
	
	public CommandUp(Player player) {
		this.myPlayer = player;
	}

	@Override
	public void execute() {
		this.myPlayer.playerMoveUp();
	}

	@Override
	public void undo() {
		this.myPlayer.playerMoveDown();
	}

}
