   package day04.Practice;


public  class Rectangle extends Polygon {
	
	protected double length;
	protected double breadth;
	
	public Rectangle(double length, double breadth) throws Exception {
		super(4);
		if(length <= 0 || breadth <= 0) {
			throw new Exception("Invalid dimensions for a rectangle");
		}
		this.length = length;
		this.breadth = breadth;
	}

	@Override
	public double calculateArea() {
		// TODO Auto-generated method stub
		return this.length * this.breadth;
	}
	
	public int getNumberOfSides() {
		return super.numberOfSides;
	}
	
	@Override
	public double circumference() {
		// TODO Auto-generated method stub
		return 2*(this.length + this.breadth);
	}

}