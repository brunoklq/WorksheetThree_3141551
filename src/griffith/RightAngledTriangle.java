package griffith;


//Student: Bruno Kennedy Lisboa de queiroz
//Student Number: 3141551
public class RightAngledTriangle extends shape {// implementation of shape class
	private double height; // attributes
	private double width; // attributes
	
	
	public RightAngledTriangle(String name, double height, double width) { // constructor to manipulate Triangle
		super(name);
		this.height = height;
		this.width = width;
		
	}

	@Override
	public double area() { // methods to calculate area
		
		return (width*height)/2;
	}

	@Override
	public double perimeter() { // methods to calculate perimeter

		double hypo = Math.hypot(width, height); // getting hypotenusa
		return width + height + hypo;
	}

	
	public String toString() { // overring
		
		return "Width: " + width + " height: " + height + "is: " +super.toString();
	}
	
	public double getHeight() { // getters and setters
		return height;
	}

	public void setHeight(double height) {// getters and setters
		this.height = height;
	}

	public double getWidth() {// getters and setters
		return width;
	}

	public void setWidth(double width) {// getters and setters
		this.width = width;
	}
	
	

}
