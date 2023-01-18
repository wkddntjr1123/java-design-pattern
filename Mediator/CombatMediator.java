public class CombatMediator implements Mediator{
	
	private Player player;
	private Enemy enemy;
	
	

	public CombatMediator(Player player, Enemy enemy) {
		this.player = player;
		this.enemy = enemy;
	}

	@Override
	public void playerAttack() {
		if(player.calcAttack() > enemy.calcDefence()) {
			
			enemy.setLife(enemy.getLife() - player.getDamage());
			
			if(enemy.getLife() < 0) {
				enemy.setLife(0);
			}
		}
		
	}
	
	@Override
	public void enemyAttack() {
		if (enemy.calcAttack() > player.calcDefence()){
			
			player.setLife(player.getLife() - enemy.getDamage());
			
			if(enemy.getLife() < 0) {
				enemy.setLife(0);
			}
		}
		
	}

	@Override
	public boolean endFight() {
		if(player.getLife() == 0) {
			System.out.println(player.getName() + " lost!!!!");
			return true;
		}
		if(enemy.getLife() == 0) {
			System.out.println(enemy.getName() + " lost!!!!");
			return true;
		}
		return false;
	}

	

}
