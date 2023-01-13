package Bridge;

public class Main {
	
	public static void main(String[] args) {
		
		Gear gearManual = new ManualGear();
		Gear gearAutomatic = new AutoMaticGear();
		Vehicle vehicle = new Car(gearManual);
		Vehicle vehicleTruck = new Truck(gearAutomatic);
		vehicle.addGear();
		vehicleTruck.addGear();
		
	}
}
