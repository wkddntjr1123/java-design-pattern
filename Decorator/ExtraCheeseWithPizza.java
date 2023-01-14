package Decorator;

public class ExtraCheeseWithPizza implements BasePizza{
	
	BasePizza pizza;
	
	public ExtraCheeseWithPizza(BasePizza pizza) {
		this.pizza = pizza;
	}

	@Override
	public int getPrice() {
		return pizza.getPrice() + 20;
	}
	
}
