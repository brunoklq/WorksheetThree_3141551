package griffith;


//Student: Bruno Kennedy Lisboa de queiroz
//Student Number: 3141551
public class Circle extends shape { // implementations shape class abstract on circle


	private double radius; // attributes

	public Circle(String name, double radius) { // constructor to manipulate circle
		super(name);
		this.radius = radius;
	}


	@Override
	public double area() { // methods to calculate area

		return Math.PI*radius*radius;
	}

	@Override
	public double perimeter() { // methods to calculate perimeter

		return 2*Math.PI*radius;
	}

	public double getRadius() {// getters and setters
		return radius;
	}

	public void setRadius(double radius) {// getters and setters
		this.radius = radius;
	}


	public String toString() { // to string to overriden

		return super.toString() + "The Radius: " + radius;
	}


}
