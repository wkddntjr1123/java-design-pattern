package Prototype;

public class Sheep implements Animal{

	public Sheep() {
		System.out.println("sheep is made");
	}
	
	@Override
	public Animal makeCopy() {		
		Sheep sheepObject = null;
		
		try {
			sheepObject = (Sheep) super.clone();
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return sheepObject;
	}
	
	public String toString(){
		return "Dolly is my hero, baaaaah";
	}
}