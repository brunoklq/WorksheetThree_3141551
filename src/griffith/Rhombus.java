package griffith;

public class Rhombus extends shape {
	
	
	private double D_1;
	private double D_2;
	private double S;
	
	public Rhombus(String name, double D_1, double D_2, double S) {
		super(name);
		this.D_1 = D_1;
		this.D_2 = D_2;
		this.S = S;
		
	
	}

	@Override
	public double area() {
	
		return 0;
	}

	@Override
	public double perimeter() {
	
		return 0;
	}

	
	
	public String toString() {
		
		
		return super.toString() + "Diagonal: " + D_1 + " and " + D_2 + "Side: " + S;
	}
	
	
	

}
