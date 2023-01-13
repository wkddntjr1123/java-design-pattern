package Bridge;

public class Car extends Vehicle{
	
	Car(Gear gear){
		super(gear);
	}

	@Override
	public void addGear() {
		gear.handleGear();
	}
}

