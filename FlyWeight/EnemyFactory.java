

import java.util.HashMap;

public class EnemyFactory {
	
	private static final HashMap<String, EnemyType> enemyMap = new HashMap();
	
	public static EnemyType getEnemy(String name, int damage, int speed) {
		Zombie theZombie = (Zombie)enemyMap.get(name);
		
		if(theZombie == null) {
			theZombie = new Zombie(name, damage, speed);
			enemyMap.put(name, theZombie);
			System.out.println("Creating " + name + " Zombie");
		}
		
		return theZombie;
	}

}
