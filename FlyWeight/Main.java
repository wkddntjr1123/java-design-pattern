import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		String names[] = {"Walker", "Spitter", "Tank", "Boomer"};
		Random rnd = new Random();
		
		for(int i = 0; i < 20; i++) {
			Zombie myZombie = (Zombie) EnemyFactory.getEnemy(names[rnd.nextInt(4)], rnd.nextInt(100), rnd.nextInt(100));
			System.out.println("A " + myZombie.getName() + " appeared");
			myZombie.move();
			myZombie.attack();
			System.out.println("--------------------------------------------------------------------------------");
		}

	}

}
