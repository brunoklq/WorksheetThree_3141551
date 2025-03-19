package griffith;

public class RightAngledTriangle extends shape {

	private double height;
	private double width;
	
	
	public RightAngledTriangle(String name, double height, double width) {
		super(name);
		this.height = height;
		this.width = width;
		
	}

	@Override
	public double area() {
		
		return (width*height)/2;
	}

	@Override
	public double perimeter() {

		double hypo = Math.hypot(width, height);
		return width + height + hypo;
	}

	
	public String toString() {
		
		return "Width: " + width + " height: " + height + "is: " +super.toString();
	}
	
	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}
	
	

}
