import java.util.Random;

public class Enemy implements MyCharacter{
	
	private String name;
	private int life;
	private int accuracy;
	private int damage;
	private Mediator mediator;
	
	

	public Enemy(String name, int life, int accuracy, int damage) {
		this.name = name;
		this.life = life;
		this.accuracy = accuracy;
		this.damage = damage;
	}

	@Override
	public void attack() {
		mediator.enemyAttack();
	}

	@Override
	public int calcDefence() {
		Random rnd = new Random();
		return rnd.nextInt(20);
	}
	
	@Override
	public int calcAttack() {
		Random rnd = new Random();
		return rnd.nextInt(20) + accuracy;
	}

	public void setMediator(Mediator mediator) {
		this.mediator = mediator;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getLife() {
		return life;
	}

	public void setLife(int life) {
		this.life = life;
	}

	public int getAccuracy() {
		return accuracy;
	}

	public void setAccuracy(int accuracy) {
		this.accuracy = accuracy;
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	
	
	

}
