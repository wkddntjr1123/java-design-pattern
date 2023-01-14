package Facade;

public class WaiterImp implements Waiter {

	@Override
	public void writeOrder() {
		System.out.println("writing order");	
	}

	@Override
	public void giveToKitchen() {
		System.out.println("order give to kitchen");
	}

	@Override
	public void serveOrder() {
		System.out.println("serve order to customer");
		
	}
	
}