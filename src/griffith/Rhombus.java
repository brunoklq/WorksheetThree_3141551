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
		
		
		return super.toString() + " Diagonal: " + D_1 + " and " + D_2 + " Side: " + S;
	}

	public double getD_1() {
		return D_1;
	}

	public void setD_1(double d_1) {
		D_1 = d_1;
	}

	public double getD_2() {
		return D_2;
	}

	public void setD_2(double d_2) {
		D_2 = d_2;
	}

	public double getS() {
		return S;
	}

	public void setS(double s) {
		S = s;
	}
	
	
	
	

}
