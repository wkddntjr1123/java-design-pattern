public class Zombie implements EnemyType{
	
	private String name;
	private int damage;
	private int speed;
	
	public Zombie(String name, int damage, int speed) {
		this.name = name;
		this.damage = damage;
		this.speed = speed;
	}

	@Override
	public void move() {
		
		System.out.println("The " + name + " moved " + speed + " squares.");
		
	}

	@Override
	public void attack() {
		
		System.out.println("The " + name + " attacked dealing " + damage + " points of damage.");
		
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getSpeed() {
		return speed;
	}

	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
}
