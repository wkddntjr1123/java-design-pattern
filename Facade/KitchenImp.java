package Facade;

class KitchenImp implements Kitchen {

	@Override
	public void prepareOrder() {
		System.out.println("preparing order");		
	}

	@Override
	public void callWaiter() {
		System.out.println("calling waiter for serving");	
	}

	@Override
	public void washDishes() {
		System.out.println("washing dishes");
	}
	
}