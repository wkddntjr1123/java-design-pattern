public class Main {

	public static void main(String[] args) {
		
		Item[] inventory = new Item[3];
		
		inventory[0] = new Item("Sword", 10);
		inventory[1] = new Item("Potion", 20);
		inventory[2] = new Item("Boots", 3);
		
		ItemIterator iterator = new ItemIterator(inventory);
		
		while(iterator.hasNext()) {
			Item myItem = (Item)iterator.next();
			System.out.println("Item name: " + myItem.getName() + " | Item attribute: " + myItem.getAttribute());
		}

	}

}
