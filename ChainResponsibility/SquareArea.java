public class SquareArea implements AreaCalculator{
	
	private AreaCalculator theNext;

	@Override
	public double valueArea(Shape theShape) {
		
		if(theShape.getType() == "Square") {
			return theShape.getValue1() * theShape.getValue2();
		}
		
		return theNext.valueArea(theShape);
	}

	@Override
	public void setNext(AreaCalculator next) {
		this.theNext = next;
	}

}
