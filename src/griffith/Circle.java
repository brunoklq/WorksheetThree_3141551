package griffith;

public class Circle extends shape {
	
	
	private double radius;

	public Circle(String name, double radius) {
		super(name);
		this.radius = radius;
	}
	
	
	@Override
	public double area() {
	
		return 0;
	}

	@Override
	public double perimeter() {
		
		return 0;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
	public String toString() {
		
		return super.toString() + "The Radius: " + radius;
	}
	

}
