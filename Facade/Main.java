package Facade;

public class Main {
	
	public static void main(String[] args) {
		
		Kitchen kitchen = new KitchenImp();
		Waiter waiter = new WaiterImp();
		
		Facade facade = new FacadeImp(kitchen, waiter);
		facade.serveCustomer();
		
	}

}