package Bridge;

public abstract class Vehicle{
	
	Gear gear;
	Vehicle(Gear  gear){
		this.gear = gear;
	}
   abstract void addGear();
}