package Bridge;

public class Truck extends Vehicle{

	Truck(Gear gear) {
		super(gear);
	}

	@Override
	public void addGear() {
		gear.handleGear();
	}
}