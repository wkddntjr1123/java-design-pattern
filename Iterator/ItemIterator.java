public class ItemIterator  implements Iterator{
	
	private Item[] inventory;
	private int position;
	
	public ItemIterator(Item[] items) {
		this.inventory = items;
	}

	@Override
	public Object next() {
		
		Item theItem = inventory[position];
		position++;
		return theItem;
	}

	@Override
	public boolean hasNext() {
		if(position >= inventory.length || inventory[position] == null) {
			return false;
		}
		return true;
	}

}
