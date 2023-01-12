package Prototype;

public class Main {

	public static void main(String[] args) {
		
		CloneFactory animalMaker = new CloneFactory();
		Sheep sally = new Sheep();
		
		Sheep clonedSally = (Sheep) animalMaker.getClone(sally);
		
		System.out.println(sally.hashCode());
		System.out.println(clonedSally.hashCode());
		

	}

}