package classTask7;

public class Rectangle extends Shape {

	private double length;
	private double width;
	
	public Rectangle() {
		super();
		
	}
	public Rectangle(String name, double length, double width) {
		super(name);
		this.length = length;
		this.width = width;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	@Override
	public double area() {
		return length*width;
	}

	@Override
	public double perimeter() {
		// TODO Auto-generated method stub
		return 2*(length+width);
		
	}
	
	
	

}
