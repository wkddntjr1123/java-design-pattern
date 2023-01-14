package Decorator;

public class Main {
	
	public static void main(String[] args) {
	
    BasePizza pizza = new MargrettaPizza();
    System.out.println("MargrettaPizza price: "+pizza.getPrice());
    BasePizza extraCheese = new ExtraCheeseWithPizza(pizza);
    System.out.println("MargrettaPizza extra cheese price: "+extraCheese.getPrice());
    BasePizza doubleCheese = new ExtraCheeseWithPizza(extraCheese);
    System.out.println("MargrettaPizza double cheese price: "+doubleCheese.getPrice());
	}
}