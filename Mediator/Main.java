import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		Player myPlayer = new Player("Carlos", 50, 5, 5);
		Enemy myEnemy = new Enemy("Zombie", 30, 2, 3);
		
		Mediator combat = new CombatMediator(myPlayer, myEnemy);
		
		Random rnd = new Random();
		
		myPlayer.setMediator(combat);
		myEnemy.setMediator(combat);
		
		while(!combat.endFight()) {
			if(rnd.nextInt(10) % 2 == 0) {
				myPlayer.attack();
				System.out.println(myPlayer.getName() + " attacked!");
			}
			else {
				myEnemy.attack();
				System.out.println(myEnemy.getName() + " attacked!");
			}
		}

	}

}
