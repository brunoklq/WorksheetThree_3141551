package griffith;


//Student: Bruno Kennedy Lisboa de queiroz
//Student Number: 3141551
public class Rhombus extends shape { // implementantion of class

	
	private double D_1; // attributes
	private double D_2; // attributes
	private double S; // attributres

	public Rhombus(String name, double D_1, double D_2, double S) { // constructor to set the values from rhombus
		super(name);
		this.D_1 = D_1;
		this.D_2 = D_2;
		this.S = S;

	}

	@Override
	public double area() { // method to calculate area

		return (D_1*D_2)/2;
	}

	@Override
	public double perimeter() { // method to calculate perimeter

		return 4*S;
	}


	public String toString() { // to string to overriden


		return super.toString() + " Diagonal: " + D_1 + " and " + D_2 + " Side: " + S;
	}

	public double getD_1() { // getters and setters
		return D_1;
	}

	public void setD_1(double d_1) {// getters and setters
		D_1 = d_1;
	}

	public double getD_2() {// getters and setters
		return D_2;
	}

	public void setD_2(double d_2) {// getters and setters
		D_2 = d_2;
	}

	public double getS() {// getters and setters
		return S;
	}

	public void setS(double s) {// getters and setters
		S = s;
	}





}
