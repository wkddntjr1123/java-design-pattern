package Facade;

public class FacadeImp implements Facade {
	
  Kitchen kitchen;
  Waiter waiter;
  
  public FacadeImp(Kitchen kitchen, Waiter waiter) {
	this.kitchen= kitchen;
	this.waiter =  waiter;
}

	@Override
	public void serveCustomer() {
		waiter.writeOrder();
		waiter.giveToKitchen();
		kitchen.prepareOrder();
		kitchen.callWaiter();
		waiter.serveOrder();
		kitchen.washDishes();
	}
	
}