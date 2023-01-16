public class TriangleArea implements AreaCalculator{
	
	private AreaCalculator theNext;

	@Override
	public double valueArea(Shape theShape) {
		
		if(theShape.getType() == "Triangle") {
			return (theShape.getValue1() * theShape.getValue2())/2;
		}
		
		return theNext.valueArea(theShape);
	}

	@Override
	public void setNext(AreaCalculator next) {
		this.theNext = next;
	}

}
