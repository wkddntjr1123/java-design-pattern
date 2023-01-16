package Command;

public class CommandDown implements PlayerCommand{
	
	private Player myPlayer;
	
	public CommandDown(Player player) {
		this.myPlayer = player;
	}

	@Override
	public void execute() {
		this.myPlayer.playerMoveDown();
	}

	@Override
	public void undo() {
		this.myPlayer.playerMoveUp();
	}

}
