public class Main {

	public static void main(String[] args) {
		
		Shape mySquare = new Shape("Square", 10.3, 10.3);
		Shape myTriangle = new Shape("Triangle", 10.3, 10.3);
		
		SquareArea calcAreaSquare = new SquareArea();
		TriangleArea calcAreaTriangle = new TriangleArea();
		
		calcAreaSquare.setNext(calcAreaTriangle);
		calcAreaTriangle.setNext(null);
		
		System.out.println("Area " + mySquare.getType() + " = " + calcAreaSquare.valueArea(mySquare));
		System.out.println("Area " + myTriangle.getType() + " = " + calcAreaTriangle.valueArea(myTriangle));

	}

}
